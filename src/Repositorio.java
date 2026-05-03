
import java.util.List;

public interface Repositorio {

    public Obra guardarObra(Obra obra);//involuicrta bases de datos y fichero
    public  int eliminar(String id);//involuicrta bases de datos y fichero
    public List<Obra> obtenerObras();//involuicrta bases de datos y fichero
    public List<Obra> obtenerMejorValoradas(int cantidad);//obtener as obras mas valoradas
    public List<Manga> obtenerManga();//obtenemos todos los mangas
    public List<Manhwa> obtenerManhwas();//obtenemos todos los manhwas

    //mostrar los mejores valorados mangas y manhwas 
}
