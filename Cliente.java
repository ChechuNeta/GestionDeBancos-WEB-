package Gestion;

public class Cliente 
{

		private String DNI;
		private String nombre;
		private String apellidos;
		
		
		
		public Cliente(String el_DNI, String el_nombre, String el_apellidos)
		{
			this.SetDNI(el_DNI);
			this.SetNombre(el_nombre);
			this.SetApellidos(el_apellidos);
		}



		private void SetDNI(String dNI) {
			DNI = dNI;
		}

		public void SetNombre(String nombre) {
			this.nombre = nombre;
		}

		public void SetApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		
		
		protected String GetInfo()
		{	String st_resultado;
		
			st_resultado = "Clase: " + this.getClass().getSimpleName() + " ==> ";
			st_resultado = st_resultado + "DNI: " + this.DNI + " / ";
			st_resultado = st_resultado + "Nombre: " + this.nombre + " / ";
			st_resultado = st_resultado + "Apellidos: " + this.apellidos;
			
			return st_resultado;
		}
}
