public class Libro {

    private String nombre;
    private String codigo;
    private boolean disponibilidad;

    public Libro() {
    }

    public Libro(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.disponibilidad = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }

    public boolean libroDisponible() {
        return disponibilidad;
    }

    public void prestarLibro() {
        disponibilidad = false;
    }

    public void devolverLibro() {
        disponibilidad = true;
    }
}
