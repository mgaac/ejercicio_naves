const BASE_URL = 'http://localhost:8080/api';

export const shipService = {
  // Get recent announcements
  getRecentAnnouncements: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/recientes`);
      
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  // Get ships announced to dock
  getShipsDockedToday: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/atracar/hoy`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  getShipsDockedThisWeek: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/atracar/semana`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  getShipsDockedInRange: async (startDate, endDate) => {
    try {
      const response = await fetch(
        `${BASE_URL}/naves/anunciadas/atracar/rango?fechaInicio=${startDate}&fechaFin=${endDate}`
      );
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  // Get ships announced to depart
  getShipsDepartingToday: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/zarpar/hoy`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  getShipsDepartingThisWeek: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/zarpar/semana`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  getShipsDepartingInRange: async (startDate, endDate) => {
    try {
      const response = await fetch(
        `${BASE_URL}/naves/anunciadas/zarpar/rango?fechaInicio=${startDate}&fechaFin=${endDate}`
      );
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  // Report ship movements
  reportArrival: async (uvi, arrivalDate) => {
    try {
      const response = await fetch(
        `${BASE_URL}/naves/reportar/arribo?uvi=${uvi}&fechaArribo=${arrivalDate}`
      );
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  reportDeparture: async (uvi, departureDate) => {
    try {
      const response = await fetch(
        `${BASE_URL}/naves/reportar/zarpe?uvi=${uvi}&fechaZarpe=${departureDate}`
      );
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  },

  getShipByUvi: async (uvi) => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/uvi?uvi=${uvi}`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`HTTP error! status: ${response.status}, details: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('Could not connect to the server. Please ensure the backend is running.');
      }
      throw error;
    }
  }
}; 