
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

        mangas.add(new Manga("1", "Atelier of Witch Hat", new Autor("Kamome Shirahama", "Japon"), new Genero(TiposGenero.SEINEN, "Fantasia"), "activo", 4.7, 16));
        mangas.add(new Manga("2", "One Piece", new Autor("Eiichiro Oda", "Japon"), new Genero(TiposGenero.SHONEN, "Aventura"), "activo", 5, 108));
        mangas.add(new Manga("3", "Oyasumi Punpun", new Autor("Inio Asano", "Japon"), new Genero(TiposGenero.SEINEN, "Psicologico"), "finalizado", 5, 13));
        mangas.add(new Manga("4", "Mobile Suit Gundam: The Origin", new Autor("Yoshikazu Yasuhiko", "Japon"), new Genero(TiposGenero.SEINEN, "Mecha"), "finalizado", 4, 12));
        mangas.add(new Manga("5", "Kaoru Hana wa Rin to Saku", new Autor("Saka Mikami", "Japon"), new Genero(TiposGenero.SHONEN, "Romance"), "activo", 3.7, 10));
        mangas.add(new Manga("6", "Rent-A-Girlfriend", new Autor("Reiji Miyajima", "Japon"), new Genero(TiposGenero.SHONEN, "Romcom"), "activo", 2.8, 36));
        mangas.add(new Manga("7", "Berserk", new Autor("Kentaro Miura", "Japon"), new Genero(TiposGenero.SEINEN, "Fantasia oscura"), "activo", 5, 42));
        mangas.add(new Manga("8", "My Hero Academia", new Autor("Kohei Horikoshi", "Japon"), new Genero(TiposGenero.SHONEN, "Accion"), "finalizado", 4.5, 42));
        mangas.add(new Manga("9", "Vinland Saga", new Autor("Makoto Yukimura", "Japon"), new Genero(TiposGenero.SEINEN, "Historico"), "activo", 5, 28));
        mangas.add(new Manga("10", "Kaguya-sama: Love is War", new Autor("Aka Akasaka", "Japon"), new Genero(TiposGenero.SEINEN, "Romcom"), "finalizado", 4.5, 28));
        mangas.add(new Manga("11", "Pokemon Adventures", new Autor("Hidenori Kusaka", "Japon"), new Genero(TiposGenero.SHONEN, "Aventura"), "activo", 3.5, 64));
        mangas.add(new Manga("12", "Uzumaki", new Autor("Junji Ito", "Japon"), new Genero(TiposGenero.SEINEN, "Terror"), "finalizado", 4.1, 3));
        mangas.add(new Manga("13", "Horimiya", new Autor("HERO / Daisuke Hagiwara", "Japon"), new Genero(TiposGenero.SHONEN, "Romance"), "finalizado", 3.7, 16));
        mangas.add(new Manga("14", "Black Clover", new Autor("Yuki Tabata", "Japon"), new Genero(TiposGenero.SHONEN, "Fantasia"), "activo", 4.6, 36));
        mangas.add(new Manga("15", "Bleach", new Autor("Tite Kubo", "Japon"), new Genero(TiposGenero.SHONEN, "Accion"), "finalizado", 4.6, 74));

        return mangas;

    }
}
