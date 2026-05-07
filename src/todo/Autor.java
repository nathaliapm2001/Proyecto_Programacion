

public class Autor {
    
    private String nombre;
    private String pais;

    public Autor(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor{");
        sb.append("nombre=").append(nombre);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    }



    
}
