import java.util.List;

public class Estudiante extends Usuario{

    private int maxLibrosPrestados;

    public Estudiante(String nombre, String cedula) {
        super(nombre, cedula);
        this.maxLibrosPrestados = 3;
    }

    public int getMaxLibrosPrestados() {
        return maxLibrosPrestados;
    }

    public void setMaxLibrosPrestados(int maxLibrosPrestados) {
        this.maxLibrosPrestados = maxLibrosPrestados;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "maxLibrosPrestados=" + maxLibrosPrestados +
                '}';
    }

    @Override
    public void prestarLibro(Libro libro) {
        if (getLibrosPrestados().size() < maxLibrosPrestados) {
            super.prestarLibro(libro);
            System.out.println("Libro prestado al estudiante: " + getNombre());

        } else {
            System.out.println("El estudiante ha alcanzado el límite de libros.");
        }
    }
}
