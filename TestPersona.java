/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosPOO;
import java.util.Scanner;
/**
 *
 * @author Jesus Eduardo
 */
public class TestPersona 
{
    public static void main(String[] args) 
    {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = entrada.next();
 
        System.out.println("Introduce la edad");
        int edad = entrada.nextInt();
 
        System.out.println("Introduce el sexo");
        char sexo = entrada.next().charAt(0);
 
        System.out.println("Introduce el peso");
        double peso = entrada.nextDouble();
 
        System.out.println("Introduce la altura");
        double altura = entrada.nextDouble();
        //Creamos objetos con cada constructor
        Persona p1 = new Persona();
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona(nombre, edad, sexo, peso, altura);
        p1.setNombre("Maria");
        p1.setEdad(21);
        p1.setSexo('M');
        p1.setPeso(53);
        p1.setAltura(1.72);
        System.out.println("Persona 1");
        MuestraMensajePeso(p1);
        MuestraMayorDeEdad(p1);
        System.out.println(p1.toString());
 
        System.out.println("Persona 2");
        MuestraMensajePeso(p2);
        MuestraMayorDeEdad(p2);
        System.out.println(p2.toString());
 
        System.out.println("Persona 3");
        MuestraMensajePeso(p3);
        MuestraMayorDeEdad(p3);
        System.out.println(p3.toString());
    }
    public static void MuestraMensajePeso(Persona p) 
    {
        int IMC = p.calcularIMC();
        switch (IMC) 
        {
            case Persona.Peso_Ideal:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.Infrapeso:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.Sobrepeso:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) 
    {
 
        if (p.esMayorDeEdad()) 
        {
            System.out.println("La persona es mayor de edad");
        } 
        else 
        {
            System.out.println("La persona no es mayor de edad");
        }
    }
}
