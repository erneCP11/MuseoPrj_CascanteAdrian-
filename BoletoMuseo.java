
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase BoletoMuseo
 * Representa un boleto de entrada al museo
 * Contiene información sobre precio, número de boleto y fecha de emisión.
 * Incluye un contador global de boletos emitidos.
 * 
 * @author Adrián Ernesto Cascante Pérez
 * @version 1.0
 */
public class BoletoMuseo {
    private double precio; /** Precio del boleto. */
    private int numeroBoleto; /** Número único asignado automáticamente al boleto. */
    private String fechaEmision; /** Fecha de emisión del boleto. */
    private static int contador = 0; /** Contador global de todos los boletos creados y emitidos. */
    
    /**
     * Método constructor que crea un nuevo boleto con un precio dado
     * El número de boleto y la fecha de emisión se generan automáticamente
     * @param precio precio del boleto
     */
    
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }
    
    /** Método de instancia que establece la fecha de emisión del boleto.
     * @return fecha de emisión en formato yyyy-MM-dd
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /** Método de clase que permite obtener el número total de boletos emitidos. 
     * @return cantidad de boletos emitidos
     */ 
    public static int getContador() {
        return contador;
    }
    
    /** Método de instancia que permite obtener el número asignado a un boleto
     * @return número del boleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }
    
    /** Método de instancia que permite obtener el precio del boleto
     * @return precio de boleto
     */
    public double getPrecio() {
        return precio;
    }
    
    
    /** Método de instancia que devuelve una representación en texto del boleto
     * @return cadena con número, precio y fecha de emisión
     */
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg += " Numero: " + numeroBoleto + "\n";
        msg += " Precio: " + precio + "\n";
        msg += " Fecha Emision: " + fechaEmision;
        return msg;
    }
}