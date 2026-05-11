
public class Genero {
    
    private String descripcion;
    private TiposGenero genero;

    public Genero(TiposGenero genero, String descripcion) {
        this.genero = genero;
        this.descripcion = descripcion;
    }

    public TiposGenero getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Genero{");
        sb.append("descripcion=").append(descripcion);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }



    
}
