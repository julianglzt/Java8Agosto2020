/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.sesion23;

public class Guajolote extends Ave implements Volador {

    public static void main(String[] args) {
        Ave ave = new Guajolote();
//        System.out.println(guajolote.getNombre());
//        guajolote.duerme();
        Guajolote guajolote = (Guajolote) ave;
//        ave.duerme();
        imprimirNombre(guajolote);
//        imprimirNombre(new Ave());
//        imprimirNombre(new Guajolote());
//        aVolar(ave);
        aVolar(guajolote);
    }

    @Override
    public String getNombre() {
        return "Cancu";
    }

    public void duerme() {
        System.out.println("zzzzz");
    }

    public static void imprimirNombre(Ave ave) {
        System.out.println(ave.getNombre());
    }

    public static void aVolar(Volador volador) {
        volador.volar();
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando");
    }
}
