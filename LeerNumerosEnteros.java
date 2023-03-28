package Gestion;

import java.util.Scanner;

public class LeerNumerosEnteros 
{	// PROPIEDADES
    // CTES
    
    // VARIABLES
    Scanner sc;
    
    // CONTRUCTORES
    public LeerNumerosEnteros(Scanner unescaner)
    {   sc = unescaner;
    }
    
    // GET
    
    // SET
    
    // OTROS PROCEDIIMIENTOS
    /***************************************************************************
     * Lee un número entero y si se produce algún error muestra el mensaje de 
     * error dado como segundo parámetro
     * @param msg_si_error
     * @return 
     */
    public int LeerEntero(String st_msg_pedir_numero, String st_msg_si_error)
    {   int     i_numero_leido;
        boolean b_lectura_correcta;
    
        // no es necesario pero hay que ponerlo porque el compilador detecta un 
        // error de variable no inicializada que nunnca se da
        i_numero_leido = Integer.MIN_VALUE;
        
        do
        {   try
            {   System.out.println(st_msg_pedir_numero);
                i_numero_leido = sc.nextInt();
                b_lectura_correcta = true;
            }
            catch (Exception exx_error)
            {   b_lectura_correcta = false;
            }
            sc.nextLine(); // obligatorio, Si no se pone da error. Haya error o no hay que poner esto
        }
        while (b_lectura_correcta == false);
        
        return i_numero_leido;
    }
    /**************************************************************************/
    
    
    /***************************************************************************
     * Lee un número entero mayor o igual al valor dado como tercer parámetro
     * @param st_msg_pedir_numero
     * @param st_msg_si_error
     * @param i_valor_minimo
     * @return 
     */
    public int LeerEntero(String st_msg_pedir_numero, String st_msg_si_error, int i_valor_minimo)
    {   int     i_numero_leido;
        boolean b_lectura_correcta;
    
        // no es necesario pero hay que ponerlo porque el compilador detecta un 
        // error de variable no inicializada que nunnca se da
        i_numero_leido = Integer.MIN_VALUE;
        
        do
        {   try
            {   System.out.println(st_msg_pedir_numero);
                i_numero_leido = sc.nextInt();
                
                if (i_numero_leido >= i_valor_minimo)
                {   b_lectura_correcta = true;
                }
                else
                {   b_lectura_correcta = false;
                }
            }
            catch (Exception exx_error)
            {   b_lectura_correcta = false;
            }
            sc.nextLine(); // obligatorio, Si no se pone da error
        }
        while (b_lectura_correcta == false);
        
        return i_numero_leido;
    }
    /**************************************************************************/
    
    
    /***************************************************************************
     * Lee un número entero entre los dos valores dados como mínimo y máxino
     * 8ambos incluidos)
     * @param st_msg_pedir_numero
     * @param st_msg_si_error
     * @param i_valor_minimo
     * @return 
     */
    public int LeerEntero(String st_msg_pedir_numero, String st_msg_si_error, int i_valor_minimo, int i_valor_maximo)
    {   int     i_numero_leido;
        boolean b_lectura_correcta;
    
        // no es necesario pero hay que ponerlo porque el compilador detecta un 
        // error de variable no inicializada que nunnca se da
        i_numero_leido = Integer.MIN_VALUE;
        
        do
        {   try
            {   System.out.println(st_msg_pedir_numero);
                i_numero_leido = sc.nextInt();
                
                if ((i_numero_leido >= i_valor_minimo) && (i_numero_leido <= i_valor_maximo))
                {   b_lectura_correcta = true;
                }
                else
                {   b_lectura_correcta = false;
                }
            }
            catch (Exception exx_error)
            {   b_lectura_correcta = false;
            }
            sc.nextLine(); // obligatorio, Si no se pone da error
        }
        while (b_lectura_correcta == false);
        
        return i_numero_leido;
    }
    /**************************************************************************/
    
    
    /***************************************************************************
     * Lee un número entero mayor o igual al valor dado como tercer parámetro
     * @param st_msg_pedir_numero
     * @param st_msg_si_error
     * @param i_valor_minimo
     * @return 
     */
    public int LeerEnteroMenorIgualA(String st_msg_pedir_numero, String st_msg_si_error, int i_valor_maximo)
    {   int     i_numero_leido;
        boolean b_lectura_correcta;
    
        // no es necesario pero hay que ponerlo porque el compilador detecta un 
        // error de variable no inicializada que nunnca se da
        i_numero_leido = Integer.MIN_VALUE;
        
        do
        {   try
            {   System.out.println(st_msg_pedir_numero);
                i_numero_leido = sc.nextInt();
              
                if (i_numero_leido <= i_valor_maximo)
                {   b_lectura_correcta = true;
                }
                else
                {   b_lectura_correcta = false;
                }
            }
            catch (Exception exx_error)
            {   b_lectura_correcta = false;
            }
            sc.nextLine(); // obligatorio, Si no se pone da error
        }
        while (b_lectura_correcta == false);
        
        return i_numero_leido;
    }
    /**************************************************************************/
    

}
