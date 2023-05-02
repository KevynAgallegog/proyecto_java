import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Estudiante {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
       
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = sc.nextInt();
        
       
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
            String nombre = sc.next();
            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = sc.nextInt();
            Estudiante estudiante = new Estudiante(nombre, edad);
            estudiantes.add(estudiante);
        }
        
      
        System.out.println("\nLista de estudiantes:");
        imprimirListaEstudiantes(estudiantes);
        
  
        double promedioEdades = calcularPromedioEdades(estudiantes);
        System.out.println("\nEl promedio de edades es " + promedioEdades + " años.");
        
     
        ArrayList<Estudiante> estudiantesMayoresEdad = buscarEstudiantesMayoresEdad(estudiantes);
        System.out.println("\nLos estudiantes de mayor edad son:");
        imprimirListaEstudiantes(estudiantesMayoresEdad);
        
        
        ArrayList<Estudiante> estudiantesMenoresEdad = buscarEstudiantesMenoresEdad(estudiantes);
        System.out.println("\nLos estudiantes de menor edad son:");
        imprimirListaEstudiantes(estudiantesMenoresEdad);
        
       
        int cantidadMayoresEdad = contarMayoresEdad(estudiantes);
        System.out.println("\nHay " + cantidadMayoresEdad + " estudiantes mayores de edad.");
        
      
        System.out.print("\nIngrese el nombre del estudiante a buscar: ");
        String nombreBuscado = sc.next();
        Estudiante estudianteBuscado = buscarPorNombre(estudiantes, nombreBuscado);
        if (estudianteBuscado != null) {
            System.out.println(estudianteBuscado.getNombre() + " tiene " + estudianteBuscado.getEdad() + " años.");
        } else {
            System.out.println("No se encontró ningún estudiante con el nombre " + nombreBuscado + ".");
        }
        
        
        System.out.print("\nIngrese la edad del estudiante a buscar: ");
        int edadBuscada = sc.nextInt();
        ArrayList<Estudiante> estudiantesEdadBuscada = buscarPorEdad(estudiantes, edadBuscada);
        if (estudiantesEdadBuscada.size() > 0) {
            System.out.println("\nLos estudiantes con " + edadBuscada + " años son:");
            imprimirListaEstudiantes(estudiantesEdadBuscada);
        } else {
            System.out.println("No se encontró ningún estudiante con " + edadBuscada + " años.");
        }
        
        sc.close();
    }
    
    