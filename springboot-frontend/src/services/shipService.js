const BASE_URL = 'http://localhost:8080/api';

export const shipService = {
  // Get ships announced to dock
  getShipsDockedToday: async () => {
    const response = await fetch(`${BASE_URL}/naves/anunciadas/atracar/hoy`);
    return response.json();
  },

  getShipsDockedThisWeek: async () => {
    const response = await fetch(`${BASE_URL}/naves/anunciadas/atracar/semana`);
    return response.json();
  },

  getShipsDockedInRange: async (startDate, endDate) => {
    const response = await fetch(
      `${BASE_URL}/naves/anunciadas/atracar/rango?fechaInicio=${startDate}&fechaFin=${endDate}`
    );
    return response.json();
  },

  // Get ships announced to depart
  getShipsDepartingToday: async () => {
    const response = await fetch(`${BASE_URL}/naves/anunciadas/zarpar/hoy`);
    return response.json();
  },

  getShipsDepartingThisWeek: async () => {
    const response = await fetch(`${BASE_URL}/naves/anunciadas/zarpar/semana`);
    return response.json();
  },

  getShipsDepartingInRange: async (startDate, endDate) => {
    const response = await fetch(
      `${BASE_URL}/naves/anunciadas/zarpar/rango?fechaInicio=${startDate}&fechaFin=${endDate}`
    );
    return response.json();
  },

  // Report ship movements
  reportArrival: async (uvi, arrivalDate) => {
    const response = await fetch(
      `${BASE_URL}/naves/reportar/arribo?uvi=${uvi}&fechaArribo=${arrivalDate}`
    );
    return response.json();
  },

  reportDeparture: async (uvi, departureDate) => {
    const response = await fetch(
      `${BASE_URL}/naves/reportar/zarpe?uvi=${uvi}&fechaZarpe=${departureDate}`
    );
    return response.json();
  },
}; 