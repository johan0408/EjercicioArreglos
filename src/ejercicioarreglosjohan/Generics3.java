package ejercicioarreglosjohan;

import java.util.ArrayList;
import java.util.LinkedList;

public class Generics3
{

    private static String a;
        public static void main(String arg[])
{
    //Se crea una colección de tipo entero para
    //el almacenamiento y procesamiento de numeros
            ArrayList<Integer> listaNums = new ArrayList<>();
            listaNums.add(2);
            listaNums.add(7);
            listaNums.add(5);
    //Se crea una colección de tipo string para
    //el almacenamiento y procesamiento de cadenas de caracteres
    LinkedList<String> listaCiudades = new LinkedList<>();
        listaCiudades.add("Manizales");
        listaCiudades.add("Medellin");
        listaCiudades.add("Cali");
    //Se crea una colección de tipo Alumno para
    //el almacenamiento y procesamiento de Alumnos
            ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Andres",3.2));
        alumnos.add(new Alumno("Julian",4.2)); 
        alumnos.add(new Alumno("Carlos",4.9));

    //Procesamiento de los datos almacenados en las colecciones
    //sin necesidad de casting int a=listaNums.get(0);
        String b=listaCiudades.get(0);
        Alumno c=alumnos.get(0);

        System.out.println("El primer numero es "+a);
        System.out.println("La primera ciudad es "+b);
        System.out.println("El alumno "+c.getNombre()+" obtuvo una nota de "+c.getNota());
    }
}
