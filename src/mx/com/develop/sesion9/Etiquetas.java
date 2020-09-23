package mx.com.develop.sesion9;

public class Etiquetas {

    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        int[][] edades = {{15, 20, 18}, {24, 56, 18}};
        PRIMER_CICLO:
        for (int[] arreglo : edades) {
//            System.out.println(i + " " + "i");
            SEGUNDO_CICLO:
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
                if (arreglo[i] == 18) {
//                    System.out.println(arreglo[i]);
//                    continue PRIMER_CICLO;
                    continue;
                }
                System.out.println("continua el for");
            }
        }
        System.out.println("Fin");
    }

    public static void test1() {
        int[][] edades = {{15, 20, 18}, {24, 56, 18}};
        PRIMER_CICLO:
        for (int[] arreglo : edades) {
//            System.out.println(i + " " + "i");
            SEGUNDO_CICLO:
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
                if (arreglo[i] == 18) {
//                    System.out.println(arreglo[i]);
                    break PRIMER_CICLO;
//                    break;
                }
                System.out.println("continua el for");
            }
        }
        System.out.println("Fin");
    }
}
