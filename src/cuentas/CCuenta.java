package cuentas;

/**
 * 
 * Clase cuenta 
 * @author javier
 *
 */

public class CCuenta {
	
	/**
	 * Atributos de la clase
	 */
	 private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInteres;
	    
	    /**
	     * Constructor vacio
	     */
	    public CCuenta()
	    {
	    }
	    /**
	     * Constructor de los 4 atributos
	     * @param nom
	     * @param cue
	     * @param sal
	     * @param tipo
	     */
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        nombre =nom;
	        cuenta=cue;
	        saldo=sal;
	    }
	    /**
	     * Método que devuelve el saldo
	     * @return
	     */
	    public double estado()
	    {
	        return saldo;
	    }
	    /**
	     * Método que devuelve la cantidad con la condición
	     * @param cantidad
	     * @throws Exception
	     */
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }
	    /**
	     * Método que retira la cantidad con la condición
	     * @param cantidad
	     * @throws Exception
	     */
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        saldo = saldo - cantidad;
	    }

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the cuenta
		 */
		public String getCuenta() {
			return cuenta;
		}

		/**
		 * @param cuenta the cuenta to set
		 */
		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		/**
		 * @return the saldo
		 */
		public double getSaldo() {
			return saldo;
		}

		/**
		 * @param saldo the saldo to set
		 */
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		/**
		 * @return the tipoInterés
		 */
		public double getTipoInteres() {
			return tipoInteres;
		}

		/**
		 * @param tipoInterés the tipoInterés to set
		 */
		public void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
	    

}
