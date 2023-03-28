package Gestion;

import java.util.ArrayList;

public class Banco 
{
	
	private final static int CTE_LONGITUD_OFICINA = 4;
	private final static int CTE_LONGITUD_DC = 2;
	private final static int CTE_LONGITUD_OFICINANUMERO_CUENTA = 8;
	private String nombrebanco;
	private String CIF;		//clave
	private String pais;
	private int    entidad;
	
	private ArrayList<Cuenta> lista_cuenta;
	private ArrayList<Cliente>	lista_cliente;
	private ArrayList<Cuenta_cliente> 	lista_cuenta_clientes;
	
	//constructor
	public Banco(String n_nombre, String n_Cif, String n_pais, int n_entidad)
	{
		this.SetNombre(n_nombre);
		this.SetCIF(n_Cif);
		this.SetPais(n_pais);
		this.SetEntidad(n_entidad);
		
		this.lista_cuenta = new ArrayList<Cuenta>();
		this.lista_cliente = new ArrayList<Cliente>();
		this.lista_cuenta_clientes = new ArrayList<Cuenta_cliente>();
	}
	
	
	private void SetNombre(String nombre)
	{
		this.nombrebanco = nombre;
	}
	
	private void SetCIF(String Cif)
	{
		this.CIF = Cif;
	}
	

	private String GetPais()
	{
		return this.pais;
	}
	
	private void SetPais(String Pais)
	{
		this.pais = Pais;
	}
	
	
	private int GetEntidad()
	{
		return this.entidad;
	}
	
	private void SetEntidad(int Entidad)
	{
		this.entidad = Entidad;
	}
	
	protected String GetCIF()
	{	return this.CIF;
	}
	
	
	
	//Desde punto de vista web
	//-Insertar banco		Insert banco en BD
	//-Borrar banco			delente en BD
	//-Modificar banco		Upadate en BD
	//-Lista bancos			Select en BD
	
	
	
	
	//otros metodos
	protected String GenerarCodigoCuenta()
	{	// el código de cuenta tiene el siguiente formato
		// el pais + entidad + oficina + DC + cuenta
		//     2        4         4       2      8
		String 	st_resultado;
		
		st_resultado = this.GetPais();
		st_resultado = st_resultado + this.GetEntidad();
		// oficina
		st_resultado = st_resultado + NumeroAleatorio.GetNumeroconLongitud(CTE_LONGITUD_OFICINA);
		// DC
		st_resultado = st_resultado + NumeroAleatorio.GetNumeroconLongitud(CTE_LONGITUD_DC);
		// NÚMERO DE CUENTA
		st_resultado = st_resultado + NumeroAleatorio.GetNumeroconLongitud(CTE_LONGITUD_OFICINANUMERO_CUENTA);
	
		return st_resultado;
	}
	/** */
	

	
	
	protected String GetInfo()
	{	String st_resultado;
	
		st_resultado = "Clase: " + this.getClass().getSimpleName() + " ==> ";
		st_resultado = st_resultado + "Banco: " + this.nombrebanco + " / ";
		st_resultado = st_resultado + "CIF Banco: " + this.CIF + " / ";
		st_resultado = st_resultado + "Pais: " + this.pais + " / ";
		st_resultado = st_resultado + "Entidad: " + this.entidad;
		
		return st_resultado;
	}
		
		
	protected Cuenta CrearCuentaCliente(String DNI, String nombre, String apellidos, double saldoinicial)
	{
		Cliente uncliente;
		Cuenta unacuenta;
		Cuenta_cliente unacuentacliente;
		
		uncliente = new Cliente(DNI, nombre, apellidos);
		unacuenta = new Cuenta(this.GenerarCodigoCuenta() , saldoinicial);
		unacuentacliente = new Cuenta_cliente(DNI, unacuenta.GetCodigo_cuenta());
		
		return unacuenta;
	}
	
	
}
