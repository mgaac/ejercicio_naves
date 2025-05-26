'use client';

import { useState, useEffect } from 'react';
import { servicioNaves } from '../services/servicioNaves';
import TarjetaNave from '../components/TarjetaNave';

const estiloBoton = {
  padding: '5px 10px',
  margin: '5px',
  border: '1px solid #ccc'
};

const estiloSeccion = {
  marginBottom: '20px'
};

const estiloInput = {
  margin: '5px',
  padding: '5px'
};

const estiloDivisor = {
  display: 'inline-block',
  width: '1px',
  height: '24px',
  margin: '0 10px',
  backgroundColor: '#ccc',
  verticalAlign: 'middle'
};

export default function Inicio() {
  const [vista, setVista] = useState('recientes');
  const [naves, setNaves] = useState([]);
  const [cargando, setCargando] = useState(true);
  const [fechaInicio, setFechaInicio] = useState('');
  const [fechaFin, setFechaFin] = useState('');
  const [uviReporte, setUviReporte] = useState('');
  const [fechaReporte, setFechaReporte] = useState('');

  useEffect(() => {
    cargarNaves();
  }, [vista]);

  const cargarNaves = async () => {
    setCargando(true);
    try {
      let datos;
      console.log('Cargando naves para vista:', vista);
      switch (vista) {
        case 'recientes':
          datos = await servicioNaves.obtenerAnunciosRecientes();
          break;
        case 'atraque-hoy':
          datos = await servicioNaves.obtenerNavesAtracadasHoy();
          break;
        case 'atraque-semana':
          datos = await servicioNaves.obtenerNavesAtracadasSemana();
          break;
        case 'zarpe-hoy':
          datos = await servicioNaves.obtenerNavesZarpandoHoy();
          break;
        case 'zarpe-semana':
          datos = await servicioNaves.obtenerNavesZarpandoSemana();
          break;
        default:
          console.warn('Tipo de vista desconocido:', vista);
          datos = [];
      }
      console.log('Datos recibidos:', datos);
      setNaves(datos);
    } catch (error) {
      console.error('Error al cargar naves:', {
        name: error.name,
        message: error.message,
        stack: error.stack,
        type: error instanceof TypeError ? 'TypeError' : 'Desconocido',
        toString: error.toString()
      });
      alert(`Error al cargar naves: ${error.toString()}. Por favor, revise la consola para más detalles.`);
    } finally {
      setCargando(false);
    }
  };

  const manejarBusquedaRango = async () => {
    if (!fechaInicio || !fechaFin) {
      alert('Por favor seleccione ambas fechas');
      return;
    }

    setCargando(true);
    try {
      const datos = vista.startsWith('atraque') 
        ? await servicioNaves.obtenerNavesAtracadasRango(fechaInicio, fechaFin)
        : await servicioNaves.obtenerNavesZarpandoRango(fechaInicio, fechaFin);
      setNaves(datos);
    } catch (error) {
      console.error('Error al cargar naves:', error);
      alert('Error al cargar naves. Por favor intente nuevamente.');
    }
    setCargando(false);
  };

  const manejarReporte = async (tipo) => {
    if (!uviReporte || !fechaReporte) {
      alert('Por favor ingrese tanto el UVI como la fecha');
      return;
    }

    try {
      const exito = tipo === 'arribo'
        ? await servicioNaves.reportarArribo(uviReporte, fechaReporte)
        : await servicioNaves.reportarZarpe(uviReporte, fechaReporte);
      
      if (exito) {
        alert(`${tipo === 'arribo' ? 'Arribo' : 'Zarpe'} reportado exitosamente`);
        setUviReporte('');
        setFechaReporte('');
        cargarNaves();
      } else {
        alert('No se pudo reportar. Por favor intente nuevamente.');
      }
    } catch (error) {
      console.error('Error al reportar:', error);
      alert('Error al reportar. Por favor intente nuevamente.');
    }
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1 style={{ fontWeight: 'bold', marginBottom: '15px', fontSize: '25px' }}>Sistema de Gestión de Naves</h1>
      
      <div style={estiloSeccion}>
        <div>
          <button
            onClick={() => setVista('recientes')}
            style={{
              ...estiloBoton,
              backgroundColor: vista === 'recientes' ? '#eee' : 'white'
            }}
          >
            Anuncios Recientes
          </button>
          <div style={estiloDivisor}></div>
          <button
            onClick={() => setVista('atraque-hoy')}
            style={{
              ...estiloBoton,
              backgroundColor: vista === 'atraque-hoy' ? '#eee' : 'white'
            }}
          >
            Atraques Hoy
          </button>
          <button
            onClick={() => setVista('atraque-semana')}
            style={{
              ...estiloBoton,
              backgroundColor: vista === 'atraque-semana' ? '#eee' : 'white'
            }}
          >
            Atraques Esta Semana
          </button>
          <div style={estiloDivisor}></div>
          <button
            onClick={() => setVista('zarpe-hoy')}
            style={{
              ...estiloBoton,
              backgroundColor: vista === 'zarpe-hoy' ? '#eee' : 'white'
            }}
          >
            Zarpes Hoy
          </button>
          <button
            onClick={() => setVista('zarpe-semana')}
            style={{
              ...estiloBoton,
              backgroundColor: vista === 'zarpe-semana' ? '#eee' : 'white'
            }}
          >
            Zarpes Esta Semana
          </button>
        </div>
      </div>

      <div style={estiloSeccion}>
        <h2 style={{ fontWeight: 'bold'}}>Buscar por Rango de Fechas</h2>
        <div>
          <label>Fecha Inicio: </label>
          <input
            type="datetime-local"
            value={fechaInicio}
            onChange={(e) => setFechaInicio(e.target.value)}
            style={estiloInput}
          />
          <label>Fecha Fin: </label>
          <input
            type="datetime-local"
            value={fechaFin}
            onChange={(e) => setFechaFin(e.target.value)}
            style={estiloInput}
          />
          <button onClick={manejarBusquedaRango} style={estiloBoton}>
            Buscar
          </button>
        </div>
      </div>

      <div style={estiloSeccion}>
        <h2 style={{ fontWeight: 'bold'}}>Reportar Movimiento</h2>
        <div>
          <label>UVI: </label>
          <input
            type="text"
            value={uviReporte}
            onChange={(e) => setUviReporte(e.target.value)}
            maxLength={5}
            style={estiloInput}
          />
          <label>Fecha: </label>
          <input
            type="datetime-local"
            value={fechaReporte}
            onChange={(e) => setFechaReporte(e.target.value)}
            style={estiloInput}
          />
          <button onClick={() => manejarReporte('arribo')} style={estiloBoton}>
            Reportar Arribo
          </button>
          <button onClick={() => manejarReporte('zarpe')} style={estiloBoton}>
            Reportar Zarpe
          </button>
        </div>
      </div>

      <div style={estiloSeccion}>
        <h2 style={{ fontWeight: 'bold'}}>Naves</h2>
        {cargando ? (
          <p>Cargando...</p>
        ) : naves.length > 0 ? (
          <div>
            {naves.map((nave) => (
              <TarjetaNave key={nave.uvi} nave={nave} />
            ))}
          </div>
        ) : (
          <p>No se encontraron naves.</p>
        )}
      </div>
    </div>
  );
}
