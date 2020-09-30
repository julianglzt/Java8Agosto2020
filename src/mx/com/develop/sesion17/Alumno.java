/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion17;

public class Alumno {

    private String nombre;
    private String apellido;

    public static void main(String[] args) {
        Alumno nuevo = new Alumno();
        Alumno nuevo2 = new Alumno("Pedro");
        Alumno nuevo3 = new Alumno("Pedro", "Paramo");
//        Alumno1 alumno1 = Alumno1.creaAlumno();
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Hola alumno: " + nombre + " " + apellido);
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        System.out.println("Hola alumno: " + nombre);
    }

    public Alumno() {
        this.nombre = "Nuevo Ingreso";
        System.out.println("Hola alumno: " + nombre);
    }

}
