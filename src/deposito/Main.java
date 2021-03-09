/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deposito;

/**
 *
 * @author Jesus Moya
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		operativa_cuenta();
	}

	private static void operativa_cuenta() {
		// TODO code application logic here
		CCuenta miCuenta;
		double saldoActual;
		
		miCuenta = new CCuenta("Antonio López", "100-2365-85-1230456789", 2500, 0);
		saldoActual = miCuenta.estado();
		System.out.println("Hola" + miCuenta.getNombre() + "El saldo actual de su cuenta es " + saldoActual);
		
		try {
			miCuenta.retirar(2300);
		} catch (Exception e) {
			System.out.println("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			miCuenta.ingresar(695);
		} catch (Exception e) {
			System.out.println("Fallo al ingresar");
		}
	}
	
}
