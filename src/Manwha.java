
public class Manwha extends Obra {

    private int capitulo;

    public Manwha(String idObra, String titulo, Autor autor, Genero genero, String estado, double estrellas,
            int capitulo) {
        super(idObra, titulo, autor, genero, estado, estrellas);
        this.capitulo = capitulo;
    }

    @Override
    public String mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCapitulo() {
        return capitulo;
    }

}
