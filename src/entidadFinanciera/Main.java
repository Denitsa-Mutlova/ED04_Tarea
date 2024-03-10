/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

/**
 *
 * @author DENITSA
 */
public class Main {

    /**
     * Método principal que inicia la aplicación.
     * Crea una instancia de la clase CCuenta y muestra el saldo actual.
     * @param args
     */
    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        probarRetirar(objetoCuenta,3000, 0.0);
        probarIngresar(objetoCuenta,-3000, 0.0);
        
    }
    
    /**
     * Realiza una prueba de retirada de dinero de una cuenta.
     * @param cuenta La cuenta desde la que se realizará la retirada.
     * @param cantidad La cantidad a retirar.
     * @param cantidadEsperada La cantidad esperada tras la retirada.
     */
    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
    try {
        cuenta.retirar(cantidad);
        System.out.println("Retirar con éxito. Nuevo saldo: " + cuenta.estado());
    } catch (Exception e) {
        System.err.println("Error al retirar: " + e.getMessage());
    }
}
    
    /**
     * Realiza una prueba de ingreso de dinero en una cuenta.
     * @param cuenta La cuenta en la que se realizará el ingreso.
     * @param cantidad La cantidad a ingresar.
     * @param cantidadEsperada La cantidad esperada tras el ingreso.
     */
    public static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
    try {
        cuenta.ingresar(cantidad);
        System.out.println("Ingresar con éxito. Nuevo saldo: " + cuenta.estado());
    } catch (Exception e) {
        System.err.println("Error al ingresar: " + e.getMessage());
    }
}
    
}
