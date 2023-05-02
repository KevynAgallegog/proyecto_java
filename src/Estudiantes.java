
import java.util.Scanner;

public class Estudiantes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = sc.nextInt();
        
 
        String[] nombres = new String[cantidadEstudiantes];
        int[] edades = new int[cantidadEstudiantes];
        
    
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = sc.nextInt();
        }
        
     
        System.out.println("\nLista de estudiantes:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println(nombres[i] + " tiene " + edades[i] + " años.");
        }
        
        // Calcular el promedio de edades
        double sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        double promedioEdades = sumaEdades / cantidadEstudiantes;
        System.out.println("\nEl promedio de edades es " + promedioEdades + " años.");
        
        // Identificar los estudiantes de mayor edad
        int edadMaxima = Integer.MIN_VALUE;
        for (int edad : edades) {
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }
        System.out.println("\nLos estudiantes de mayor edad son:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (edades[i] == edadMaxima) {
                System.out.println(nombres[i] + " con " + edadMaxima + " años.");
            }
        }
        
        // Identificar los estudiantes de menor edad
        int edadMinima = Integer.MAX_VALUE;
        for (int edad : edades) {
            if (edad < edadMinima) {
                edadMinima = edad;
            }
        }
        System.out.println("\nLos estudiantes de menor edad son:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (edades[i] == edadMinima) {
                System.out.println(nombres[i] + " con " + edadMinima + " años.");
            }
        }
        
        
        int cantidadMayoresEdad = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                cantidadMayoresEdad++;
            }
        }
        System.out.println("\nHay " + cantidadMayoresEdad + " estudiantes mayores de edad.");
        
      
        System.out.print("\nIngrese el estudiante:  ");
        String nombreBuscado = sc.next();
        int indiceEstudiante = -1;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                indiceEstudiante = i;
                break;
            }