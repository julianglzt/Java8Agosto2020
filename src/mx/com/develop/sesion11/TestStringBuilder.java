package mx.com.develop.sesion11;

import java.time.LocalDateTime;

public class TestStringBuilder {

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        long startMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Memoria libre inicial: " + startMemory);
//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
//        String str = "";
//        for (int i = 0; i < 10_000_000; i++) {
//        for (int i = 0; i < 1_000_000; i++) {
        for (int i = 0; i < 100_000; i++) {
            sb.append(":").append(i);
//            str = str.concat(":");
        }
        LocalDateTime end = LocalDateTime.now();
        long nanos = end.getNano() - start.getNano();
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Memoria libre final: " + endMemory);
        System.out.println("Tiempo: " + nanos);
        System.out.println("Memoria: " + (startMemory - endMemory));
    }
    
}
