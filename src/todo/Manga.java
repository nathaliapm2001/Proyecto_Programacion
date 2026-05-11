import java.io.Serializable;

public class Manga extends Obra implements Serializable {

    private int volumen;

    public Manga(String idObra, String titulo, Autor autor, Genero genero, String estado, double estrellas, int stock,
            int volumen) {
        super(idObra, titulo, autor, genero, estado, estrellas, stock);
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    @Override
    public String mostrarDetalles() {
        return "Manga: " + super.getTitulo() + "\n" +
                "Autor: " + super.getAutor().getNombre() + "\n" +
                "Genero: " + super.getGenero().getNombre() + " " + super.getGenero().getDescripcion() + "\n" +
                "Estado: " + super.getEstado() + "\n" +
                "Estrellas: " + super.getEstrellas() + "\n" +
                "Stock: " + super.getStock() + "\n" +
                "Volumen: " + getVolumen();
    }

}
