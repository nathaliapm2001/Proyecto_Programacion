import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Fichero {
    private static final String FICHERO = "cache.txt"; // terminar ficheros

    public static List<Obra> cargarFichero() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO))) {
            return (List<Obra>) ois.readObject();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
