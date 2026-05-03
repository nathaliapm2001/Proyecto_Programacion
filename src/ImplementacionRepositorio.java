import java.util.ArrayList;
import java.util.List;

public class ImplementacionRepositorio implements Repositorio{
    private final DAOManga daoManga;
    private final DAOManhwa daoManhwa;


    public ImplementacionRepositorio() {
        this.daoManga= new DAOManga();
        this.daoManhwa=new DAOManhwa();
    }



    @Override
    public Obra guardarObra(Obra obra) {
        if(obra == null){
            return null;
        }
        if (obra instanceof Manga manga) {
            daoManga.getMangas();
            //para bs sqlManga.insertarManga(manga)
        }else if(obra instanceof Manhwa manhwa){
            daoManhwa.getManhwas();
            //para bs sqlManhwa.insertarManhwa(manhwa)
        }
        return obra;

    }

    @Override
    public int eliminar(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<Obra> obtenerObras() {
        List<Obra> todasLasObras= new ArrayList<>();
        todasLasObras.addAll(daoManga.getMangas());
        todasLasObras.addAll(daoManhwa.getManhwas());
        return todasLasObras;
    }

    @Override
    public List<Obra> obtenerMejorValoradas(int cantidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerMejorValoradas'");
    }

    @Override
    public List<Manga> obtenerManga() {
        
        return new ArrayList<>(daoManga.getMangas());
    }

    @Override
    public List<Manhwa> obtenerManhwas() {

        return new ArrayList<>(daoManhwa.getManhwas());
    }

}
