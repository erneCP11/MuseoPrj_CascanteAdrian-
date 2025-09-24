
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase VentaDelDia
 * Representa la venta de boletos en un día específico del museo
 * Contiene la fecha y una lista de los boletos vendidos
 * 
 * @author Adrián Ernesto Cascante Pérez
 * @version 1.0
 */

public class VentaDelDia {
    private String fechaDeLaVenta; /** Fecha de la venta */ 
    private List<BoletoMuseo> boletosVendidos; /** Lista de boletos vendidos en el día */
    
    /** Método constructor que crea una venta con la fecha actual e inicializa la lista de los boletos vendidos. */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }
    
    /** Método de instancia que registra un boleto vendido en la lista
     * @param boleto boleto vendido
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }
    
    /** Método de instancia que calcula el total de la venta del día, sumando todos los precios de los boletos vendidos
     * @return total de la venta
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for(BoletoMuseo b : boletosVendidos) {
            total += b.getPrecio();
        }
        return total;
    }
    
    /** Método de instancia que establece la fecha actual como fecha de venta
     * @return fecha actual en formato yyyy-MM-dd
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /** Método de instancia que devuelve una representación textual de la venta del día
     * @return cadena con fecha, cantidad de boletos, detalley total
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += " Fecha: " + fechaDeLaVenta + "\n";
        msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += " Detalle:\n";
        for(BoletoMuseo b : boletosVendidos) {
            msg += "  -Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += " Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}