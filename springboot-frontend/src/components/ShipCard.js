export default function ShipCard({ ship }) {
  const formatDateTime = (dateStr) => {
    if (!dateStr) return 'N/A';
    return new Date(dateStr).toLocaleString();
  };

  return (
    <div style={{ 
      border: '1px solid #ccc',
      padding: '10px',
      margin: '10px 0'
    }}>
      <h3>{ship.nave?.descripc || 'Unknown Ship'}</h3>
      <div>
        <p>UVI: {ship.uvi}</p>
        <p>Line: {ship.linea?.descripc || 'N/A'}</p>
        <p>Voyage Number: {ship.viajes || 'N/A'}</p>
        <p>ETA: {formatDateTime(ship.eta)}</p>
        <p>ETD: {formatDateTime(ship.etd)}</p>
        <p>Status: {ship.estAnun || 'N/A'}</p>
      </div>
    </div>
  );
} 