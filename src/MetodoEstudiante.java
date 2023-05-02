public static void imprimirListaEstudiantes(ArrayList<Estudiante> estudiantes) {
for (Estudiante estudiante : estudiantes) {
System.out.println(estudiante.getNombre() + " tiene " + estudiante.getEdad() + " años.");
}
}

public static double calcularPromedioEdades(ArrayList<Estudiante> estudiantes) {
 int sumaEdades = 0;
 for (Estudiante estudiante : estudiantes) {
     sumaEdades += estudiante.getEdad();
 }
 double promedioEdades = (double) sumaEdades / estudiantes.size();
 return promedioEdades;
}


public static ArrayList<Estudiante> buscarEstudiantesMayoresEdad(ArrayList<Estudiante> estudiantes) {
 ArrayList<Estudiante> estudiantesMayoresEdad = new ArrayList<>();
 int maxEdad = 0;
 for (Estudiante estudiante : estudiantes) {
     if (estudiante.getEdad() > maxEdad) {
         maxEdad = estudiante.getEdad();
     }
 }
 for (Estudiante estudiante : estudiantes) {
     if (estudiante.getEdad() == maxEdad) {
         estudiantesMayoresEdad.add(estudiante);
     }
 }
 return estudiantesMayoresEdad;
}


public static ArrayList<Estudiante> buscarEstudiantesMenoresEdad(ArrayList<Estudiante> estudiantes) {
 ArrayList<Estudiante> estudiantesMenoresEdad = new ArrayList<>();
 int minEdad = estudiantes.get(0).getEdad();
 for (Estudiante estudiante : estudiantes) {
     if (estudiante.getEdad() < minEdad) {
         minEdad = estudiante.getEdad();
     }
 }
 for (Estudiante estudiante : estudiantes) {
     if (estudiante.getEdad() == minEdad) {
         estudiantesMenoresEdad.add(estudiante);
     }
 }
 return estudiantesMenoresEdad;
}


public static int contarMayoresEdad(ArrayList<Estudiante> estudiantes) {
 int cantidadMayoresEdad = 0;
 for (Estudiante estudiante : estudiantes) {
     if (estudiante.getEdad() >= 18) {
         cantidadMayoresEdad++;
     }
 }
 return cantidadMayoresEdad;
}


public static Estudiante buscarPorNombre(ArrayList<Estudiante> estudiantes, String nombreBuscado) {
 for (Estudiante estudiante : estudiantes) {
     if (estudiante.getNombre().equalsIgnoreCase(nombreBuscado)) {
         return estudiante;
     }
 }
 return null;
}


public static ArrayList<Estudiante> buscarPorEdad(ArrayList<Estudiante> estudiantes, int edadBuscada) {
 ArrayList<Estudiante> estudiantesEdadBuscada = new ArrayList<>();
 for (Estudiante estudiante : estudiantes) {
     if (estudiante.getEdad() == edadBuscada) {
         estudiantesEdadBuscada.add(estudiante);
     }
 }
 return estudiantesEdadBuscada;
}
}

class Estudiante {


private String nombre;
private int edad;

public Estudiante(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}
