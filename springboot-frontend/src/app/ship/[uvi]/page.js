'use client';

import { useEffect, useState } from 'react';
import { useParams } from 'next/navigation';
import { shipService } from '@/services/shipService';

export default function ShipDetailPage() {
  const { uvi } = useParams();
  const [ship, setShip] = useState(null);
  const [loading, setLoading] = useState(true);

  const formatDateTime = (dateStr) => {
    if (!dateStr) return 'N/A';
    return new Date(dateStr).toLocaleString();
  };

  useEffect(() => {
    const fetchShipDetails = async () => {
      console.log(uvi);
      try {
        const data = await shipService.getShipByUvi(uvi);
        setShip(data);
      } catch (error) {
        console.error('Error fetching ship details:', error);
      } finally {
        setLoading(false);
      }
    };

    fetchShipDetails();
  }, [uvi]);

  if (loading) {
    return <div className="p-4">Loading...</div>;
  }

  if (!ship) {
    return <div className="p-4">Ship not found</div>;
  }

  return (
    <div className="p-6 max-w-4xl mx-auto">
      <h1 className="text-3xl font-bold mb-6">{ship.nave?.descripc || 'Unknown Ship'}</h1>
      
      <div className="bg-white shadow-lg rounded-lg p-6">
        <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
          <div>
            <h2 className="text-xl font-semibold mb-4">Basic Information</h2>
            <div className="space-y-3">
              <p><strong>Ship Name:</strong> {ship.nave?.descripc || 'N/A'}</p>
              <p><strong>ETA:</strong> {formatDateTime(ship.eta)}</p>
              <p><strong>ETD:</strong> {formatDateTime(ship.etd)}</p>
              <p><strong>Actual Arrival:</strong> {formatDateTime(ship.fecAtraq)}</p>
              <p><strong>Actual Departure:</strong> {formatDateTime(ship.fecZarpe)}</p>
              <p><strong>Leading Shipping Line:</strong> {ship.linea?.descripc || 'N/A'}</p>
            </div>
          </div>
          
          <div>
            <h2 className="text-xl font-semibold mb-4">Operation Details</h2>
            <div className="space-y-3">
              <p><strong>Containers Unloaded:</strong> {ship.contenedoresDescargados || 'N/A'}</p>
              <p><strong>Containers Loaded:</strong> {ship.contenedoresEmbarcados || 'N/A'}</p>
              <p><strong>Restows per Line:</strong> {ship.reestibasPorLinea || 'N/A'}</p>
              <p><strong>Operations Start:</strong> {formatDateTime(ship.inicioOperaciones)}</p>
              <p><strong>Operations End:</strong> {formatDateTime(ship.finOperaciones)}</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
} 