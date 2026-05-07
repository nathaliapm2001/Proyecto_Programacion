
import java.util.ArrayList;
import java.util.List;

public class DAOManhwa {

    private List<Manhwa> manhwas;

    public DAOManhwa() {
        this.manhwas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "DAOManhwa [manhwas=" + manhwas + "]";
    }

    public List<Manhwa> getManhwas() {
        return manhwas;
    }

    public List<Manhwa> listaManhwas() {
        // aqui rellenas tus manhwas

        manhwas.add(new Manhwa("1", "The Boxer", new Autor("JH", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Deporte/Psicologico"), "finalizado", 4.8, 123));
        manhwas.add(new Manhwa("2", "Solo Leveling", new Autor("Chugong", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Accion/Fantasia"), "finalizado", 5, 179));
        manhwas.add(new Manhwa("3", "Omniscient Reader's Viewpoint", new Autor("Sing Shong", "Corea del Sur"),
                new Genero(TiposGenero.SEINEN, "Accion/Fantasia"), "activo", 4.9, 200));
        manhwas.add(new Manhwa("4", "Tower of God", new Autor("SIU", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Aventura/Fantasia"), "activo", 4.7, 600));
        manhwas.add(new Manhwa("5", "Sweet Home", new Autor("Carnby Kim", "Corea del Sur"),
                new Genero(TiposGenero.SEINEN, "Terror"), "finalizado", 4.5, 141));
        manhwas.add(new Manhwa("6", "Bastard", new Autor("Carnby Kim", "Corea del Sur"),
                new Genero(TiposGenero.SEINEN, "Psicologico"), "finalizado", 4.6, 94));
        manhwas.add(new Manhwa("7", "Lookism", new Autor("Park Tae-jun", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Drama"), "activo", 4.4, 500));
        manhwas.add(new Manhwa("8", "The Beginning After the End", new Autor("TurtleMe", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Isekai/Fantasia"), "activo", 4.7, 180));
        manhwas.add(new Manhwa("9", "Eleceed", new Autor("Son Jae-ho", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Accion"), "activo", 4.6, 250));
        manhwas.add(new Manhwa("10", "Hardcore Leveling Warrior", new Autor("Sehoon Kim", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Videojuegos"), "finalizado", 4.3, 318));
        manhwas.add(new Manhwa("11", "True Beauty", new Autor("Yaongyi", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Romance"), "finalizado", 4.2, 223));
        manhwas.add(new Manhwa("12", "Gosu", new Autor("Ryu Gi-woon", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Artes marciales"), "finalizado", 4.5, 233));
        manhwas.add(
                new Manhwa("13", "Dice: The Cube That Changes Everything", new Autor("Yun Hyunseok", "Corea del Sur"),
                        new Genero(TiposGenero.SEINEN, "Psicologico/Fantasia"), "finalizado", 4.1, 388));
        manhwas.add(new Manhwa("14", "Killstagram", new Autor("Ryu Jin", "Corea del Sur"),
                new Genero(TiposGenero.SEINEN, "Terror/Thriller"), "finalizado", 4.0, 100));
        manhwas.add(new Manhwa("15", "I Love Yoo", new Autor("Quimchee", "Corea del Sur"),
                new Genero(TiposGenero.SHONEN, "Romance/Drama"), "activo", 4.3, 250));

        return manhwas;

    }

}
