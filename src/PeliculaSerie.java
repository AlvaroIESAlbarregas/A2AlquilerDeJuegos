public class PeliculaSerie {
    private int id;
    private String titulo;
    private String nombreDelDirector;
    private Categoria categoria;

    public PeliculaSerie(int id, String titulo, String nombreDelDirector, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nombreDelDirector = nombreDelDirector;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ID: " + id + " TITULO: " + titulo + " NOMBRE DEL DIRECTOR: " + nombreDelDirector ;
    }

    public int getId() {
        return id;
    }
}
