public class Persona {
    private String dni;
    private String nombre;
    private String email;

    public Persona(String dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " NOMBRE: " + nombre + " EMAIL: " + email;
    }

    public String getDni() {
        return dni;
    }
}
