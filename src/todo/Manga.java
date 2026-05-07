import java.io.Serializable;

public class Manga extends Obra implements Serializable, Repositorio {

    private int volumen;

    public Manga(String idObra, String titulo, Autor autor, Genero genero, String estado, double estrellas,
            int volumen) {
        super(idObra, titulo, autor, genero, estado, estrellas);
        this.volumen = volumen;
    }

    @Override
    public String mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getVolumen() {
        return volumen;
    }

}
