
import java.util.List;

public interface Repositorio {

    public Obra guardarObra();//involuicrta bases de datos y fichero
    public  int eliminar(String id);//involuicrta bases de datos y fichero
    public List<Obra> obtenerObras();//involuicrta bases de datos y fichero

    //mostrar los mejores valorados mangas y manhwas 
}
