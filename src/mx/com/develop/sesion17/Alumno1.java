/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion17;

public class Alumno1 {

    public static void main(String[] args) {
        Alumno1 alumno1 = new Alumno1();
    }

    private Alumno1() {
        System.out.println("Hola");
    }

    static Alumno1 creaAlumno() {
        
        //logica previa
        return new Alumno1();
    }
}
