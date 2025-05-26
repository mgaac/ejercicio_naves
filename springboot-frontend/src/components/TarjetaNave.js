import Link from 'next/link';

export default function TarjetaNave({ nave }) {
  const formatearFechaHora = (fechaStr) => {
    if (!fechaStr) return 'N/A';
    return new Date(fechaStr).toLocaleString();
  };

  return (
    <div style={{ 
      border: '1px solid #ccc',
      borderRadius: '8px',
      padding: '15px',
      margin: '10px 0',
      boxShadow: '0 2px 4px rgba(0,0,0,0.1)'
    }}>
      <Link 
        href={`/nave/${nave.uvi}`}
        style={{ 
          textDecoration: 'none',
          color: '#2563eb',
          cursor: 'pointer'
        }}
      >
        <h3 style={{ 
          marginBottom: '15px',
          color: '#2563eb',
          '&:hover': {
            textDecoration: 'underline'
          }
        }}>
          {nave.nave?.descripc || 'Nave Desconocida'}
        </h3>
      </Link>
      
      <div style={{ display: 'grid', gridTemplateColumns: '1fr', gap: '8px' }}>
        <p><strong>UVI:</strong> {nave.uvi || 'N/A'}</p>
        <p><strong>LRN (Registro Lloyd):</strong> {nave.nave?.edi || 'N/A'}</p>
        <p><strong>RCS (Señal de Llamada):</strong> {nave.nave?.llamada || 'N/A'}</p>
        <p><strong>Línea Naviera:</strong> {nave.linea?.descripc || 'N/A'}</p>
        
        <div style={{ marginTop: '10px' }}>
          <h4 style={{ color: '#34495e' }}>Tiempos Estimados:</h4>
          <p><strong>ETA:</strong> {formatearFechaHora(nave.eta)}</p>
          <p><strong>ETD:</strong> {formatearFechaHora(nave.etd)}</p>
        </div>

        <div style={{ marginTop: '10px' }}>
          <h4 style={{ color: '#34495e' }}>Tiempos Reales:</h4>
          <p><strong>Arribo Real:</strong> {formatearFechaHora(nave.fecAtraq)}</p>
          <p><strong>Zarpe Real:</strong> {formatearFechaHora(nave.fecZarpe)}</p>
        </div>
      </div>
    </div>
  );
} 