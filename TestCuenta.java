/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosPOO;

/**
 *
 * @author Jesus Eduardo
 */
public class TestCuenta 
{
    public static void main(String[] args)
    {
        Cuenta C1 = new Cuenta("Pedro");
        Cuenta C2 = new Cuenta("Fernando", 300);
        //Ingresa dinero en las cuentas
        C1.ingresar(300);
        C2.ingresar(400);
        //Retiramos dinero en las cuentas
        C1.retirar(500);
        C2.retirar(100);
        
        System.out.println(C1);
        System.out.println(C2);
    }
}
