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
public class Ordenar3 
{
    public static void main(String[] args)
    {        
        Scanner scanner = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Ingrese un numero: ");
        n1 = scanner.nextDouble();
        System.out.println("Ingrese otro numero: ");
        n2 = scanner.nextDouble();
        System.out.println("Ingrese un tercer numero: ");
        n3 = scanner.nextDouble();
        if(n1>n2 && n1>n3)
        {
            if(n2>n3)
            {
                System.out.println("1. "+n1+"\n2. "+ n2+"\n3. "+n3);
            }
            else if(n3>n2)
            {
                System.out.println("1. "+n1+"\n2. "+ n3+"\n3. "+n2);
            }
            
        }
        else if(n2>n1 && n2>n3)
        {
            if(n1>n3)
            {
                System.out.println("1. "+n2+"\n2. "+ n1+"\n3. "+n3);
            }
            else if(n3>n1)
            {
                System.out.println("1. "+n2+"\n2. "+ n3+"\n3. "+n1);
            }
        }
        else if(n3>n1 && n3>n2)
        {
            if(n1>n2)
            {
                System.out.println("1. "+n3+"\n2. "+ n1+"\n3. "+n2);
            }
            else if(n2>n1)
            {
                System.out.println("1. "+n3+"\n2. "+ n2+"\n3. "+n1);
            }
        }
    }
    
}
