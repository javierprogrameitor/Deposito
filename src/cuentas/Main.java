package cuentas;

/**
 * 
 * Inicio del programa. Se crea em el main el objeto cuenta1
 * @author javier
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    CCuenta cuenta1;
       

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        // Creo la cuenta con un saldo de 2500
        
        /**
         * LLamada al método operativa_cuenta
         */
        operativa_cuenta(cuenta1, 2300);
		
	}

	/**
	 * Se llaman a los métodos de la clase CCuenta
	 * y se imprimen los resultados
	 * @param cuenta1
	 */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		double saldoActual;
		
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: "+ saldoActual );

        try {
            cuenta1.retirar(2300); // Retiramos 2300, solo quedan 200
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695); // Ingresamos 695+200 e imprimimos
            System.out.println(" El nuevo saldo es " + cuenta1.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}

}
