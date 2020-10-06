/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion21;

public abstract class Alumno extends Persona {

//    @Override
//    String getNombre() {
//        System.out.println("getNombre");
//        return "Java 8";
//    }
    public abstract String getMatricula();

    @Override
    String getNombre() {
        return "";
    }

}
