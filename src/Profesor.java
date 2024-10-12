import java.util.List;

public class Profesor extends Usuario{

    public Profesor(String nombre, String cedula) {
        super(nombre, cedula);
    }

    @Override
    public void prestarLibro(Libro libro) {
        super.prestarLibro(libro);
        System.out.println("Libro prestado al profesor: " + getNombre());
    }
}
