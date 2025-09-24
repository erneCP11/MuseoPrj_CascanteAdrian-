
/**
 * Clase Persona
 * Representa a una persona que puede adquirir un boleto para el museo
 * Contiene su nombre, identificación y la opción de un boleto asignado.
 * 
 * @author Adrián Ernesto Cascante Pérez
 * @version 1.0
 */
public class Persona {
    private String nombre; /** Nombre de la persona */ 
    private String identificacion; /** Identificación única de la persona */ 
    private BoletoMuseo miBoleto; /** Boleto de museo asignado a la persona (puede ser null) */ 
    
    /** Método constructor que crea una persona con nombre e identificación
     * @param nombre nombre de la persona
     * @param ident identificación de la persona
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }
    
    /** Método constructor que crea una persona solo con el nombre
     * @param nombre nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    /** Método de instancia que asigna una identificación a la persona
     * @param pIdentificacion número de identificación
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }
    
    /** Método de instancia que asigna un boleto a una persona
     * @param pMiBoleto boleto de museo
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }
    
    /** Método de instancia que consulta el número de boleto de una persona
     * @return número del boleto, o error si no tiene boleto
     */
    public int consultarMiNumeroDeBoleto() {
        return miBoleto.getNumeroBoleto();
    }
    
    /** Método de instancia que devuelve representación textual de la persona
     * @return cadena con nombre, identificación y boleto asignado (si es que existe)
     */
    public String toString () {
        String msg = "Persona\n";
        msg += " Nombre: " + nombre + "\n";
        msg += " Identificacion: " + identificacion + "\n";
        if (miBoleto != null) {
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        } else {
            msg += " Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
}
