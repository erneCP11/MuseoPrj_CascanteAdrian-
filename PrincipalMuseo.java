
/**
 * Clase PrincipalMuseo
 * Es la clase principal para ejecutar el programa del museo
 * Crea objetos Persona y BoletoMuseo, registra ventas y muestra reportes
 * 
 * @author Adrián Ernesto Cascante Pérez
 * @version 1.0
 */

public class PrincipalMuseo {
    // Método principal que ejecuta el programa de prueba del museo
    public static void main(String[] args) {
        // Creación de tres personas
        Persona a, b, c;
        a = new Persona("Nicolás Maduro", "666-6");
        b = new Persona("Donald Trump", "333-3");
        c = new Persona("Claudia Sheinbaum", "777-7");
        
        // Creación de tres boletos de museo
        BoletoMuseo b1, b2, b3;
        b1 = new BoletoMuseo(4500.0);
        b2 = new BoletoMuseo(6000.0);
        b3 = new BoletoMuseo(5800.0);
        
        // Creación del registro de la venta del día
        VentaDelDia vd;
        vd = new VentaDelDia();
        
        // Asignación de b1 a persona a
        a.asignarBoleto(b1);
        System.out.println("Detalle del primer objeto Persona: " + a.toString());
        // Registro de b1 en ventas
        vd.registrarVentaBoleto(b1);
        
        // Asignación de b2 a persona b
        b.asignarBoleto(b2);
        System.out.println("Detalle del segundo objeto Persona: " + b.toString());
        // Registro de b2 en ventas
        vd.registrarVentaBoleto(b2);
        
        // Asignación de b3 a persona c
        c.asignarBoleto(b3);
        System.out.println("Detalle del tercer objeto Persona: " + c.toString());
        // Registro de b3 en ventas
        vd.registrarVentaBoleto(b3);
        
        // Descripción final del contador global de boletos creados y de la venta del día. 
        System.out.println("Contador global de boletos creados: " + BoletoMuseo.getContador());
        System.out.println("Detalle de la Venta Del Día: " + vd.toString());
    }
}