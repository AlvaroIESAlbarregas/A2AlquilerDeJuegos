import java.time.LocalDateTime;

public class Visionado {
    private Persona personaQueVisiona;
    private PeliculaSerie peliculaSerieVisionada;
    private LocalDateTime fechaDeVisionado;

    public Visionado(Persona personaQueVisiona, PeliculaSerie peliculaSerieVisionada, LocalDateTime fechaDeVisionado) {
        this.personaQueVisiona = personaQueVisiona;
        this.peliculaSerieVisionada = peliculaSerieVisionada;
        this.fechaDeVisionado = fechaDeVisionado;
    }

    @Override
    public String toString() {
        return "PERSONA QUE VISIONA: " + personaQueVisiona + " FECHA DE VISIONADO: " + fechaDeVisionado ;
    }
}
