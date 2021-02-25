package Libro.Unidad1.EjerciciosPOO;
import java.util.Random;
/**
 *
 * @author Jesus Eduardo
 */
public class Persona 
{
    private final static char Sexo_definido = 'H';
    public static final int Infrapeso = -1;
    public static final int Peso_Ideal = 0;
    public static final int Sobrepeso = 1;
 
    //Atributos
    private String nombre;
    private int edad;
    private String RFC;
    private char sexo;
    private double peso;
    private double altura;
    public Persona() 
    {
        this("", 0, Sexo_definido, 0, 0);
    }
 
    public Persona(String nombre, int edad, char sexo) 
    {
        this(nombre, edad, sexo, 0, 0);
    }
    //Métodos privados
    private void comprobarSexo() 
    {
 
        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') 
        {
            this.sexo = Sexo_definido;
        }
    }
 
   
    public Persona(String nombre, int edad, char sexo, double peso, double altura) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarRFC();
        this.sexo = sexo;
        comprobarSexo();
    }
    
    private void generarRFC() 
    {
        
        final int divisor = 23;
        //Generamos un número de 6 digitos
        int numRFC = ((int) Math.floor(Math.random() * (1000000 - 100000) + 100000));
        int res = numRFC - (numRFC / divisor * divisor);
 
        //Calculamos la letra del RFC
        char letraRFC = generaLetraRFC(res);
 
        //Pasamos el RFC a String
        RFC = letraRFC + letraRFC + letraRFC + letraRFC + Integer.toString(numRFC);
    }
 
    private char generaLetraRFC(int res) 
    {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
 
    
    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
 
    
    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }
 
   
    public void setPeso(double peso) 
    {
        this.peso = peso;
    }
 
    
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
 
    
    public int calcularIMC() 
    {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) 
        {
            return Peso_Ideal;
        } 
        else if (pesoActual < 20) 
        {
            return Infrapeso;
        } 
        else 
        {
            return Sobrepeso;
        }
    }
 
    
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
 
    
    @Override
    public String toString() 
    {
        String sexo;
        if (this.sexo == 'H') 
        {
            sexo = "hombre";
        } 
        else 
        {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "RFC: " + RFC + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
}
