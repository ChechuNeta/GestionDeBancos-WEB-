package Gestion;

import java.util.ArrayList;

public class Cuenta
{
	private String codigo_cuenta;  	//clave
	//private String CIF;				//banco
	private double saldo;
	
	//Banco unbanco;
	
	protected ArrayList<Movimiento>	Lista_Movimientos;
	
	
	
	
	public Cuenta(String codigo, double el_saldo)
	{
		this.SetCodigo_cuenta(codigo);
		//this.SetCIF(el_cif);
		this.SetSaldo(el_saldo);
		
		this.Lista_Movimientos = new ArrayList<Movimiento>();
	}
		
	
	
	public void SetCodigo_cuenta(String codigo)
	{
		this.codigo_cuenta = codigo;
	}
	
	public String GetCodigo_cuenta() 
	{
		return codigo_cuenta;
	}
	
	/*public String GetCIF() 
	{
		return CIF;
	}*/
	
	public double GetSaldo() 
	{
		return saldo;
	}
	
	
	
	/*public void SetCIF(String cIF) 
	{
		CIF = cIF;
	}*/
	
	public void SetSaldo(double saldo) 
	{
		this.saldo = saldo;
	}	
	
	
	protected String GetInfo()
	{	String st_resultado;
	
		st_resultado = "Clase: " + this.getClass().getSimpleName() + " ==> ";
		//st_resultado = st_resultado + "CIF Banco: " + this.CIF + " / ";
		st_resultado = st_resultado + "Cuenta: " + this.codigo_cuenta + " / ";
		st_resultado = st_resultado + "Saldo: " + this.saldo;
		
		return st_resultado;
	}
	
	
	protected Movimiento RealizarMovimieto(double cantidad)
	{
		
		Movimiento unmovimiento = null;
		
		if(cantidad > 0) //ingresar
		{
			unmovimiento = IngresarDinero(cantidad);
		}
		else
		{
			if(cantidad < 0) //sacar
			{
				unmovimiento = SacarDinero(-1*cantidad);		
			}
			else //cantidad 0
			{
				unmovimiento = new Movimiento(cantidad, -2222);
			}
		}
		
		this.Lista_Movimientos.add(unmovimiento);
		
		return unmovimiento;
	}
	
	
	protected Movimiento IngresarDinero(double cantidad)
	{
		this.SetSaldo(this.GetSaldo()+cantidad);
		return new Movimiento(cantidad, 1111);
	}
	
	
	protected Movimiento SacarDinero(double cantidad)
	{
		if(this.GetSaldo() >= cantidad)
		{
			this.SetSaldo(this.GetSaldo() - cantidad);
			return new Movimiento(cantidad, 1111);
		}
		else //sacar mas de lo que hay
		{
			return new Movimiento(cantidad, -2222);
		}
	}
	
}
