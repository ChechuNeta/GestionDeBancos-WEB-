package Gestion;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimiento 
{

	//private Cuenta	micuenta;
	private double	cantidad;
	private LocalDate	fecha;
	private LocalTime	hora;
	private int		pin_usuario;
	
	
	public Movimiento(/*Cuenta una_cuenta, */double eldinero, int elpin)
	{
		//this.SetCuenta(una_cuenta);
		this.setCantidad(eldinero);
		this.setPin_usuario(elpin);
		this.fecha = LocalDate.now();
		this.hora = LocalTime.now();
	}
	
	
	
	
	
	
	
	/*public void SetCuenta(Cuenta micuenta)
	{
		this.micuenta = micuenta;
	}*/
	
	
	public void setCantidad(double cantidad) 
	{
		this.cantidad = cantidad;
	}
	

	public void setPin_usuario(int pin_usuario) 
	{
		this.pin_usuario = pin_usuario;
	}
	
	
	
	protected String GetInfo()
	{
		String resultado;
		
		resultado = "Clase: " + this.getClass().getSimpleName() + " ==> ";
		resultado = resultado + "CIF Banco: " + this.cantidad;
		//resultado = resultado + "Cuenta: " + this.micuenta;
		resultado = resultado + "Saldo: " +this.pin_usuario;
		
		return resultado;
	}
	
	
	
	
	
}
