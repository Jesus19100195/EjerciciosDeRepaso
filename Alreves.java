/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosRepaso;
import java.util.Scanner;
/**
 *
 * @author Jesus Eduardo
 */
public class Alreves 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        //Al tener maximo 4 cifras
        int n, c1, c2, c3, c4;
        
        System.out.print("Introduzca un número entre 0 y 9,999: ");
        n = entrada.nextInt();
        // unidad
        c1 = n % 10;
        n = n / 10;
        //decenas
        c2 = n % 10;
        n= n/10; 
        //centenas
        c3 = n % 10;
        n = n / 10;
        //unidades de millar
        c4 = n % 10;
        n = n / 10;
        // lo imprimimos al revés:
        if(n>=1000)
        {
            System.out.println (c1 + " " + c2 + " " + c3 + " " + c4 );
            
        }
        else if(n<1000)
        {
            System.out.println (c1 + " " + c2 + " " + c3);
        }
        else if(n<100)
        {
            System.out.println (c1 + " " + c2 );
        }
        else if(n<10)
        {
            System.out.println (c1);
        }
        
    }
    
    
    
}
