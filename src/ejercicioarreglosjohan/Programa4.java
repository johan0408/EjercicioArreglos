package ejercicioarreglosjohan;


public class Programa4 {
     public static void main(String arg[])
       {       
            Alumno estudiante[]=new Alumno[3];
            estudiante[0]=new Alumno("Andres",3.5);
            estudiante[1]=new Alumno("Julian",5);
            estudiante[2]=new Alumno("Fabian",4.2);
            
            for(Alumno al:estudiante);
            {        
                
                System.out.println("El alumno "+al.getNombre()+" obtuvo una nota de "+al.getNota());
            }
       }

}
