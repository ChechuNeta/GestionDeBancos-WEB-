package Gestion;

public class Cuenta_cliente 
{

	private String DNI;				//clave
	private String codigo_cuenta;	//clave
	
	
	public Cuenta_cliente(String el_DNI, String codigocuenta)
	{
		this.SetDNI(el_DNI);
		this.SetACodigocuenta(codigocuenta);
	}
	
	private void SetDNI(String dNI) {
		DNI = dNI;
	}
	
	public void SetACodigocuenta(String codigo) {
		this.codigo_cuenta = codigo;
	}
	
	protected String GetInfo()
	{	String st_resultado;
	
		st_resultado = "Clase: " + this.getClass().getSimpleName() + " ==> ";
		st_resultado = st_resultado + "DNI: " + this.DNI + " / ";
		st_resultado = st_resultado + "Cuenta: " + this.codigo_cuenta;
		
		return st_resultado;
	}
	
	
}
