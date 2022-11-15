/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class AlumnoService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
  
    
    
    public ArrayList<Alumno> crearAlum(){
        
       
         ArrayList <Alumno> listAlumnos = new ArrayList();
           boolean flag = true;
        
        do {
           // Alumno n1 = new Alumno(); FORMA2 usando un objeto para settear valores
             ArrayList <Integer> aux = new ArrayList();
            System.out.println("ingresar Nombre: ");
            //n1.setNombre(leer.next());
            String name = leer.next();

            System.out.println("Ingrese sus 3 Notas:");
            for (int i = 0; i < 3; i++) {
                aux.add(leer.nextInt());
                //n1.setNotas(aux); setteo notas con lista auxiliar

            }
            //listAlumnos.add(n1);  añado a mi lista el objeto

            listAlumnos.add(new Alumno(name, aux));

            System.out.println("quiere ingresar otro Alumno ? SI/NO");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("no")) {
                flag = false;
            }

        } while (flag);

        return listAlumnos;
    }
    
   
    public void mostrarAlumnos(ArrayList <Alumno>listAlumnos){
        
        
        for (Alumno aux : listAlumnos) {
            System.out.println(aux);
        }
    }
   
    /**
     * recibe el nombre a buscar paara sacar su nota final
     * @param name 
     */
    public int notaFinal(String name,ArrayList <Alumno>listAlumnos){

        int n = 0;

        ArrayList<Integer> aux = new ArrayList();
        
        
        for (int i = 0; i < listAlumnos.size(); i++) {
            
            if (listAlumnos.get(i).getNombre().equals(name)) {
                for (int j = 0; j < listAlumnos.get(i).getNotas().size(); j++) {
                    aux = listAlumnos.get(i).getNotas();
                    n += aux.get(j);
                }
            }
           
        }

        return n / 3;
        
    }    
    
    
}