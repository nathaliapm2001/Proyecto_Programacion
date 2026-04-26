
import java.util.List;

public interface Repositorio {

    public Obra guardarObra();
    public  int eliminar(String id);
    public List<Obra> obtenerObras();

    
}
