import { Geist, Geist_Mono } from "next/font/google";
import "./globals.css";

const geistSans = Geist({
  variable: "--font-geist-sans",
  subsets: ["latin"],
});

const geistMono = Geist_Mono({
  variable: "--font-geist-mono",
  subsets: ["latin"],
});

export const metadata = {
  title: 'Sistema de Gestión de Naves',
  description: 'Interfaz de seguimiento y gestión de naves',
};

export default function RootLayout({ children }) {
  return (
    <html lang="es" style={{ colorScheme: 'light' }}>
      <body style={{ 
        backgroundColor: 'white',
        color: 'black'
      }}>
        {children}
      </body>
    </html>
  );
}
