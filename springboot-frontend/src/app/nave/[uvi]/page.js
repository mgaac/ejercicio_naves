'use client';

import { useEffect, useState } from 'react';
import { useParams } from 'next/navigation';
import { servicioNaves } from '@/services/servicioNaves';
import Link from 'next/link';

const estiloSeccion = {
  marginBottom: '15px',
  padding: '15px',
  borderBottom: '1px solid #eee'
};

const estiloContenedor = {
  display: 'grid',
  gridTemplateColumns: '1fr 1fr',
  gap: '15px'
};

const estiloInfo = {
  display: 'grid',
  gap: '8px'
};

const estiloTitulo = {
  fontWeight: 'bold',
  marginBottom: '10px',
  fontSize: '16px',
  color: '#333'
};

export default function PaginaDetalleNave() {
  const { uvi } = useParams();
  const [nave, setNave] = useState(null);
  const [cargando, setCargando] = useState(true);

  const formatearFechaHora = (fechaStr) => {
    if (!fechaStr) return 'N/A';
    return new Date(fechaStr).toLocaleString();
  };

  useEffect(() => {
    const obtenerDetallesNave = async () => {
      console.log(uvi);
      try {
        const datos = await servicioNaves.obtenerNavePorUvi(uvi);
        setNave(datos);
      } catch (error) {
        console.error('Error al obtener detalles de la nave:', error);
      } finally {
        setCargando(false);
      }
    };

    obtenerDetallesNave();
  }, [uvi]);

  if (cargando) {
    return <div style={{ padding: '20px' }}>Cargando...</div>;
  }

  if (!nave) {
    return <div style={{ padding: '20px' }}>Nave no encontrada</div>;
  }

  return (
    <div style={{ padding: '20px', maxWidth: '1200px', margin: '0 auto' }}>
      <div style={{ marginBottom: '15px' }}>
        <Link href="/" style={{ textDecoration: 'none', color: '#2563eb', fontSize: '14px' }}>
          ← Volver al Inicio
        </Link>
      </div>

      <h1 style={{ fontWeight: 'bold', marginBottom: '15px', fontSize: '25px' }}>{nave.nave?.descripc || 'Nave Desconocida'}</h1>
      
      <div style={estiloSeccion}>
        <div style={estiloContenedor}>
          <div style={estiloInfo}>
            <h2 style={estiloTitulo}>Información Básica</h2>
            <p><strong>UVI:</strong> {nave.uvi || 'N/A'}</p>
            <p><strong>LRN (Registro Lloyd):</strong> {nave.nave?.edi || 'N/A'}</p>
            <p><strong>RCS (Señal de Llamada):</strong> {nave.nave?.llamada || 'N/A'}</p>
            <p><strong>Línea Naviera:</strong> {nave.linea?.descripc || 'N/A'}</p>
          </div>
          
          <div style={estiloInfo}>
            <h2 style={estiloTitulo}>Tiempos Estimados y Reales</h2>
            <p><strong>ETA:</strong> {formatearFechaHora(nave.eta)}</p>
            <p><strong>ETD:</strong> {formatearFechaHora(nave.etd)}</p>
            <p><strong>Arribo Real:</strong> {formatearFechaHora(nave.fecAtraq)}</p>
            <p><strong>Zarpe Real:</strong> {formatearFechaHora(nave.fecZarpe)}</p>
          </div>
        </div>
      </div>

      <div style={estiloSeccion}>
        <h2 style={estiloTitulo}>Detalles de Operación</h2>
        <div style={estiloInfo}>
          <p><strong>Contenedores Descargados:</strong> {nave.contenedoresDescargados || 'N/A'}</p>
          <p><strong>Contenedores Embarcados:</strong> {nave.contenedoresEmbarcados || 'N/A'}</p>
          <p><strong>Reestibas por Línea:</strong> {nave.reestibasPorLinea || 'N/A'}</p>
          <p><strong>Inicio de Operaciones:</strong> {formatearFechaHora(nave.inicioOperaciones)}</p>
          <p><strong>Fin de Operaciones:</strong> {formatearFechaHora(nave.finOperaciones)}</p>
        </div>
      </div>
    </div>
  );
} 