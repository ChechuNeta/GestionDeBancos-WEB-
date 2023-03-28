package Gestion;

public class NumeroAleatorio 
{

	 public static int GetNumeroAleatorio(int i_minimo, int i_maximo)
	    {   
		 return (int)(Math.random()*(i_maximo-i_minimo+1)) + i_minimo;
	    }
	 
	 
	 public static String GetNumeroconLongitud(int longitud)
		{	
		 String 	st_intermedio;
			int		i_indice;
			
			st_intermedio = "";
			for (i_indice = 0; i_indice < longitud; i_indice++)
			{	st_intermedio = st_intermedio+GetNumeroAleatorio(0, 9);
			}
			
			return st_intermedio;
		}

}
