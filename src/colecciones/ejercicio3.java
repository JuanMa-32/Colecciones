/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Entidades.Alumno;
import Service.AlumnoService;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author NALDO
 */
public class ejercicio3 {

    /**
     * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. 

     */
    public static void main(String[] args) {

        AlumnoService a1 = new AlumnoService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alumno> listAlumnos = a1.crearAlum();
        a1.mostrarAlumnos(listAlumnos);

        System.out.println("ingrese el nombre del alumno para calcular su nota final:");
        String name = leer.next();

        boolean flag=true;
        for (int i = 0; i < listAlumnos.size(); i++) {

            if (listAlumnos.get(i).getNombre().equals(name)) {
                System.out.println( a1.notaFinal(name, listAlumnos));
               flag=false;
            }
        

        }
        
        if (flag){
             System.out.println(name+" NO SE ENCUENTRA EN EL LISTADO");
        }

    }

}
