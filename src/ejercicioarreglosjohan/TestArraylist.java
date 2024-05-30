package ejercicioarreglosjohan;

import java.util.ArrayList;
public class TestArraylist {

public class TestArrayList
{
        public static void main(String arg[])
        {
        //Crea, llena e imprime una lista con números
            ArrayList listaNums= new ArrayList();
            listaNums.add(8);
            listaNums.add(3);
            listaNums.add(5);
            listaNums.add(2);
            listaNums.add(3);
            System.out.println("Lista de numeros: "+listaNums);
//------------------------------------------

        //Crea, llena e imprime una lista con nombres
           ArrayList listaNombres= new ArrayList(); 
           listaNombres.add("Juan");
           listaNombres.add("Pedro");
           listaNombres.add("Carlos");
           listaNombres.add("Daniel");
           listaNombres.add("Carlos");
           System.out.println("Lista de nombres:"+listaNombres);
//------------------------------------------

        //Obtener un elemento particular de la lista
           System.out.println("Numero posicion 2:"+listaNums.get(2));
           System.out.println("Nombre posicion 0:"+listaNombres.get(0));

        //Reemplazar un elemento de la lista
           listaNums.set(0,15); listaNombres.set(0,"Claudia");

        //Las listas quedan así:
           System.out.println("Lista de numeros: "+listaNums); 
           System.out.println("Lista de nombres:"+listaNombres);
        }
}
}
