/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        probarRetirar(objetoCuenta,3000, 0.0);
        probarIngresar(objetoCuenta,-3000, 0.0);
        
    }
    
    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
    try {
        cuenta.retirar(cantidad);
        System.out.println("Retirar con éxito. Nuevo saldo: " + cuenta.estado());
    } catch (Exception e) {
        System.err.println("Error al retirar: " + e.getMessage());
    }
}
    
    public static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
    try {
        cuenta.ingresar(cantidad);
        System.out.println("Ingresar con éxito. Nuevo saldo: " + cuenta.estado());
    } catch (Exception e) {
        System.err.println("Error al ingresar: " + e.getMessage());
    }
}
    
}
