import java.util.ArrayList;
import java.util.List;

public class DAOManga {
    private List<Manga> mangas;

    public DAOManga() {
        this.mangas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "DAOManhwa [mangas=" + mangas + "]";
    }

    public List<Manga> getMangas() {
        return mangas;
    }

    public List<Manga> listaMangas() {
        //aqui rellenas tus mangas

        mangas.add(new Manga(null, null, null, null, null, 0, 0));

        return mangas;

    }
}
