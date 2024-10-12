import java.util.*;

public class Biblioteca {

    private HashMap<String, Libro> libros;
    private HashMap<Integer, Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
    }

    public Biblioteca(HashMap<String, Libro> libros, HashMap<Integer, Usuario> usuarios, List<Prestamo> prestamos) {
        this.libros = libros;
        this.usuarios = usuarios;
        this.prestamos = prestamos;
    }

    public HashMap<String, Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashMap<String, Libro> libros) {
        this.libros = libros;
    }

    public HashMap<Integer, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<Integer, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "libros=" + libros +
                ", usuarios=" + usuarios +
                ", prestamos=" + prestamos +
                '}';
    }


}
