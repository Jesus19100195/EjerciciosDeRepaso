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
public class AdivinaNumero 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n, Num;
        System.out.println("Introduce N: ");
        n = scanner.nextInt();
        System.out.println("Introduce un número: ");
        Num = scanner.nextInt();
        while(Num!=n) // mientras no coincidan ambos números
        {
            if(Num>n)
            {
                System.out.println("Es mayor");
                System.out.println("Introduce otro número: ");
                Num=scanner.nextInt();
            }
            else
            {
                System.out.println("Es menor");
                System.out.println("Introduce otro número: ");
                Num=scanner.nextInt();
            }
        }
        System.out.println("Felicidades, adivinaste!");

    }
    
}
