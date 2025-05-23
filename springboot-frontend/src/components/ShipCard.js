import Link from 'next/link';

export default function ShipCard({ ship }) {
  const formatDateTime = (dateStr) => {
    if (!dateStr) return 'N/A';
    return new Date(dateStr).toLocaleString();
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
        href={`/ship/${ship.uvi}`}
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
          {ship.nave?.descripc || 'Unknown Ship'}
        </h3>
      </Link>
      
      <div style={{ display: 'grid', gridTemplateColumns: '1fr', gap: '8px' }}>
        <p><strong>UVI:</strong> {ship.uvi || 'N/A'}</p>
        <p><strong>LRN (Lloyd Register):</strong> {ship.nave?.edi || 'N/A'}</p>
        <p><strong>RCS (Radio Call Signal):</strong> {ship.nave?.llamada || 'N/A'}</p>
        <p><strong>Shipping Line:</strong> {ship.linea?.descripc || 'N/A'}</p>
        
        <div style={{ marginTop: '10px' }}>
          <h4 style={{ color: '#34495e' }}>Estimated Times:</h4>
          <p><strong>ETA:</strong> {formatDateTime(ship.eta)}</p>
          <p><strong>ETD:</strong> {formatDateTime(ship.etd)}</p>
        </div>

        <div style={{ marginTop: '10px' }}>
          <h4 style={{ color: '#34495e' }}>Actual Times:</h4>
          <p><strong>Actual Arrival:</strong> {formatDateTime(ship.fecAtraq)}</p>
          <p><strong>Actual Departure:</strong> {formatDateTime(ship.fecZarpe)}</p>
        </div>
      </div>
    </div>
  );
} 