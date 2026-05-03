
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLManga {

    private final String URL = "jdbc::sqlite:mi_base_manga.db";

    private Connection connection;

    public SQLManga() throws SQLException {
        this.connection = DriverManager.getConnection(URL);

        crearTabla();

    }

    /*
     * public Manga(String idObra, String titulo, Autor autor, Genero genero, String
     * estado, double estrellas,
     * int volumen) {
     */
    private void crearTabla() throws SQLException {

        String sql = """

                    CREATE TABLE IF NOT EXISTS Manga (
                    idObra      TEXT PRIMARY KEY,
                    titulo      TEXT NOT NULL,
                    autor       TEXT NOT NULL,
                    genero      TEXT,
                    estado      TEXT,
                    estrellas   DOUBLE,
                    volumen     INTEGER
                ); """;

        Statement st = connection.createStatement();
        st.execute(sql);

        st.close();
    }

    public Connection getConnection() {
        return connection;
    }

    public boolean insertarManga(Manga manga) throws SQLException {
        boolean result = false;
        String sql = """
                INSERT INTO Manga (idObra, titulo, autor, genero, estado, estrellas) VALUES (?,?,?,?,?,?);
                """;

        PreparedStatement pst = connection.prepareStatement(sql);

        pst.setString(1, manga.getIdObra());
        pst.setString(2, manga.getTitulo());
        pst.setObject(3, manga.getAutor());
        pst.setObject(4, manga.getGenero());
        pst.setString(5, manga.getEstado());
        pst.setDouble(6, manga.getEstrellas());
        pst.setInt(7, manga.getVolumen());

        pst.close();
        return result;

    }

}
