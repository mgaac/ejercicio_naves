'use client';

import { useState, useEffect } from 'react';
import { shipService } from '../services/shipService';
import ShipCard from '../components/ShipCard';

const buttonStyle = {
  padding: '5px 10px',
  margin: '5px',
  border: '1px solid #ccc'
};

const sectionStyle = {
  marginBottom: '20px'
};

const inputStyle = {
  margin: '5px',
  padding: '5px'
};

export default function Home() {
  const [view, setView] = useState('recent');
  const [ships, setShips] = useState([]);
  const [loading, setLoading] = useState(true);
  const [startDate, setStartDate] = useState('');
  const [endDate, setEndDate] = useState('');
  const [reportUvi, setReportUvi] = useState('');
  const [reportDate, setReportDate] = useState('');

  useEffect(() => {
    loadShips();
  }, [view]);

  const loadShips = async () => {
    setLoading(true);
    try {
      let data;
      console.log('Loading ships for view:', view);
      switch (view) {
        case 'recent':
          data = await shipService.getRecentAnnouncements();
          break;
        case 'docked-today':
          data = await shipService.getShipsDockedToday();
          break;
        case 'docked-week':
          data = await shipService.getShipsDockedThisWeek();
          break;
        case 'departing-today':
          data = await shipService.getShipsDepartingToday();
          break;
        case 'departing-week':
          data = await shipService.getShipsDepartingThisWeek();
          break;
        default:
          console.warn('Unknown view type:', view);
          data = [];
      }
      console.log('Received data:', data);
      setShips(data);
    } catch (error) {
      console.error('Error loading ships:', {
        name: error.name,
        message: error.message,
        stack: error.stack,
        type: error instanceof TypeError ? 'TypeError' : 'Unknown',
        toString: error.toString()
      });
      alert(`Error loading ships: ${error.toString()}. Please check the console for more details.`);
    } finally {
      setLoading(false);
    }
  };

  const handleDateRangeSearch = async () => {
    if (!startDate || !endDate) {
      alert('Please select both start and end dates');
      return;
    }

    setLoading(true);
    try {
      const data = view.startsWith('docked') 
        ? await shipService.getShipsDockedInRange(startDate, endDate)
        : await shipService.getShipsDepartingInRange(startDate, endDate);
      setShips(data);
    } catch (error) {
      console.error('Error loading ships:', error);
      alert('Error loading ships. Please try again.');
    }
    setLoading(false);
  };

  const handleReport = async (type) => {
    if (!reportUvi || !reportDate) {
      alert('Please enter both UVI and date');
      return;
    }

    try {
      const success = type === 'arrival'
        ? await shipService.reportArrival(reportUvi, reportDate)
        : await shipService.reportDeparture(reportUvi, reportDate);
      
      if (success) {
        alert(`${type === 'arrival' ? 'Arrival' : 'Departure'} reported successfully`);
        setReportUvi('');
        setReportDate('');
        loadShips(); // Reload the current view
      } else {
        alert('Failed to report. Please try again.');
      }
    } catch (error) {
      console.error('Error reporting:', error);
      alert('Error reporting. Please try again.');
    }
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Ship Management System</h1>
      
      <div style={sectionStyle}>
        <h2>View Ships</h2>
        <div>
          <button
            onClick={() => setView('recent')}
            style={{
              ...buttonStyle,
              backgroundColor: view === 'recent' ? '#eee' : 'white'
            }}
          >
            Recent Announcements
          </button>
          <button
            onClick={() => setView('docked-today')}
            style={{
              ...buttonStyle,
              backgroundColor: view === 'docked-today' ? '#eee' : 'white'
            }}
          >
            Docking Today
          </button>
          <button
            onClick={() => setView('docked-week')}
            style={{
              ...buttonStyle,
              backgroundColor: view === 'docked-week' ? '#eee' : 'white'
            }}
          >
            Docking This Week
          </button>
          <button
            onClick={() => setView('departing-today')}
            style={{
              ...buttonStyle,
              backgroundColor: view === 'departing-today' ? '#eee' : 'white'
            }}
          >
            Departing Today
          </button>
          <button
            onClick={() => setView('departing-week')}
            style={{
              ...buttonStyle,
              backgroundColor: view === 'departing-week' ? '#eee' : 'white'
            }}
          >
            Departing This Week
          </button>
        </div>
      </div>

      <div style={sectionStyle}>
        <h2>Search by Date Range</h2>
        <div>
          <label>Start Date: </label>
          <input
            type="datetime-local"
            value={startDate}
            onChange={(e) => setStartDate(e.target.value)}
            style={inputStyle}
          />
          <label>End Date: </label>
          <input
            type="datetime-local"
            value={endDate}
            onChange={(e) => setEndDate(e.target.value)}
            style={inputStyle}
          />
          <button onClick={handleDateRangeSearch} style={buttonStyle}>
            Search
          </button>
        </div>
      </div>

      <div style={sectionStyle}>
        <h2>Report Movement</h2>
        <div>
          <label>UVI: </label>
          <input
            type="text"
            value={reportUvi}
            onChange={(e) => setReportUvi(e.target.value)}
            maxLength={5}
            style={inputStyle}
          />
          <label>Date: </label>
          <input
            type="datetime-local"
            value={reportDate}
            onChange={(e) => setReportDate(e.target.value)}
            style={inputStyle}
          />
          <button onClick={() => handleReport('arrival')} style={buttonStyle}>
            Report Arrival
          </button>
          <button onClick={() => handleReport('departure')} style={buttonStyle}>
            Report Departure
          </button>
        </div>
      </div>

      <div style={sectionStyle}>
        <h2>Ships</h2>
        {loading ? (
          <p>Loading...</p>
        ) : ships.length > 0 ? (
          <div>
            {ships.map((ship) => (
              <ShipCard key={ship.uvi} ship={ship} />
            ))}
          </div>
        ) : (
          <p>No ships found.</p>
        )}
      </div>
    </div>
  );
}
