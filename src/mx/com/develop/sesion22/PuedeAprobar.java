package mx.com.develop.sesion22;

public interface PuedeAprobar {

    void saludo();

    default void saludo1() {
        System.out.println("Saludos");
    }

    public void aprobado(int calificacion);

    abstract double calificacion();

    public void reprobado();
}
