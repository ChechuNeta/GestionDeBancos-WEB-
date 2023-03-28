package Gestion;

import java.util.ArrayList;
import java.util.Scanner;




public class prueba_menu {

	public static void main(String[] args) 
	{
		
		Scanner			sc;
		
		ArrayList<Banco> Lista_Bancos;
		
		Banco			unbanco;
		
		
		//variables locales de seleccion y cantidades
		int seleccion;
		
		
		
		//INI
		sc = new Scanner(System.in);
		
		Lista_Bancos = new ArrayList<Banco>();
		/***************************************/
		

		//Creacion de Bancos
		unbanco = new Banco("BBVA", "B12345678", "ES", 5678);
		Lista_Bancos.add(unbanco);
		unbanco = new Banco("Santander", "B87654321", "ES", 1234);
		Lista_Bancos.add(unbanco);
		unbanco = new Banco("LaCaixa", "B2468357", "ES", 1537);
		Lista_Bancos.add(unbanco);

		//PROGRAMA
		System.out.println("BIENVENIDO");
		System.out.println("");
		
		System.out.println("¿Que desea hacer?");
		System.out.println("1-/Crear Cuenta \n2-/Ingresar en cuenta");
		seleccion = sc.nextInt();
		
		switch (seleccion)
		{
			case 1:
				System.out.println("");
				System.out.println("Selecciona el banco donde quieres crear la cuenta");
				System.out.println("1-BBVA \n2-Santander \n3-LaCaixa ");
				
				break;
				
			case 2:
				
				break;
		}

		
	
		
	}
	

}
