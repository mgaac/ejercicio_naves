const BASE_URL = 'http://localhost:8080/api';

export const servicioNaves = {
  obtenerAnunciosRecientes: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/recientes`);
      
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  obtenerNavesAtracadasHoy: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/atracar/hoy`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  obtenerNavesAtracadasSemana: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/atracar/semana`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  obtenerNavesAtracadasRango: async (fechaInicio, fechaFin) => {
    try {
      const response = await fetch(
        `${BASE_URL}/naves/anunciadas/atracar/rango?fechaInicio=${fechaInicio}&fechaFin=${fechaFin}`
      );
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  obtenerNavesZarpandoHoy: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/zarpar/hoy`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  obtenerNavesZarpandoSemana: async () => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/zarpar/semana`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  obtenerNavesZarpandoRango: async (fechaInicio, fechaFin) => {
    try {
      const response = await fetch(
        `${BASE_URL}/naves/anunciadas/zarpar/rango?fechaInicio=${fechaInicio}&fechaFin=${fechaFin}`
      );
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  reportarArribo: async (uvi, fechaArribo) => {
    try {
      const response = await fetch(
        `${BASE_URL}/naves/reportar/arribo?uvi=${uvi}&fechaArribo=${fechaArribo}`
      );
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  reportarZarpe: async (uvi, fechaZarpe) => {
    try {
      const response = await fetch(
        `${BASE_URL}/naves/reportar/zarpe?uvi=${uvi}&fechaZarpe=${fechaZarpe}`
      );
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  },

  obtenerNavePorUvi: async (uvi) => {
    try {
      const response = await fetch(`${BASE_URL}/naves/anunciadas/uvi?uvi=${uvi}`);
      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(`Error HTTP! estado: ${response.status}, detalles: ${errorText}`);
      }
      return response.json();
    } catch (error) {
      if (error instanceof TypeError && error.message === 'Failed to fetch') {
        throw new Error('No se pudo conectar al servidor. Por favor, asegúrese de que el backend esté funcionando.');
      }
      throw error;
    }
  }
}; 