package ejercicioarreglosjohan;


import java.util.TreeSet;
public class TestTreeSet
{
       public static void main(String arg[])
       {
//Crea, llena e imprime un conjunto con números
           TreeSet listaNums= new TreeSet();
           listaNums.add(8);
           listaNums.add(3);
           listaNums.add(5); 
           listaNums.add(2);
           listaNums.add(3);
           System.out.println("Lista de numeros: "+listaNums);
//------------------------------------------

//Crea, llena e imprime un conjunto con nombres
          TreeSet listaNombres= new TreeSet();
          listaNombres.add("Juan"); 
          listaNombres.add("Pedro");
          listaNombres.add("Carlos"); 
          listaNombres.add("Daniel"); 
          listaNombres.add("Carlos");
          System.out.println("Lista de nombres:"+listaNombres);
//------------------------------------------

//Elementos mayores a un elemento dado
          System.out.println("Numeros mayores o iguales a 3:"+listaNums.tailSet(3));
          System.out.println("Nombres mayores o iguales a Daniel:"+listaNombres.tailSet("Daniel"));


//Se muestran los datos en orden descendente
          System.out.println("Numeros en orden descendente: "+listaNums.descendingSet());
          System.out.println("Nombres en orden descendente:"+listaNombres.descendingSet());
        }
}
