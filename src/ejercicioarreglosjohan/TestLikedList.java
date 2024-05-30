package ejercicioarreglosjohan;

 import java.util.HashSet; 
public class TestLikedList {
public class TestHashSet
{
        public static void main(String arg[])
        {
//Crea, llena e imprime una lista con números
            HashSet listaNums= new HashSet();
            listaNums.add(8);
            listaNums.add(3); 
            listaNums.add(5);
            listaNums.add(2);
            listaNums.add(3);
            System.out.println("Lista de numeros: "+listaNums);
//------------------------------------------

//Crea, llena e imprime una lista con nombres
            HashSet listaNombres= new HashSet();
            listaNombres.add("Juan");
            listaNombres.add("Pedro");
            listaNombres.add("Carlos");
            listaNombres.add("Daniel");
            listaNombres.add("Carlos");
            System.out.println("Lista de nombres:"+listaNombres);
//------------------------------------------

//Remueve un elemento de la lista
            listaNums.remove(5);
            listaNombres.remove("Pedro");

//Las listas quedan así:
            System.out.println("Lista de numeros: "+listaNums);
            System.out.println("Lista de nombres:"+listaNombres);
        }
}   
}
