/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deposito;

/**
 *
 * @author Jesus Moya
 * Visto
 */
public class CCuenta {
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	public CCuenta() 
	{
	}

	public CCuenta(String nom, String cue, double sal, double tipo) 
	{
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInterés = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double estado ()
	{
		return saldo;
	}
	
	public void ingresar(double cantidad) throws Exception
	{
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad");
		saldo += cantidad;
	}
	
	public void retirar(double cantidad) throws Exception
	{
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No hay suficiente saldo");
		saldo -= cantidad;
	}
}
