
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLManhwa {
    private final String URL = "jdbc::sqlite:mi_base_manhwa.db";

    private Connection connection;

    public SQLManhwa() throws SQLException {
        this.connection = DriverManager.getConnection(URL);

        crearTabla();

    }

    private void crearTabla() throws SQLException {

        String sql = """

                    CREATE TABLE IF NOT EXISTS Manwha (
                    idObra      TEXT PRIMARY KEY,
                    titulo      TEXT NOT NULL,
                    autor       TEXT NOT NULL,
                    genero      TEXT,
                    estado      TEXT,
                    estrellas   DOUBLE,
                    stock       INTEGER,
                    capitulo    INTEGER
                ); """;

        // meter la lista de manhwas en la base de datos

        Statement st = connection.createStatement();
        st.execute(sql);

        st.close();
    }

    public Connection getConnection() {
        return connection;
    }

    public boolean insertarManga(Manhwa manhwa) throws SQLException {
        boolean result = false;
        String sql = """
                INSERT INTO Manhwa (idObra, titulo, autor, genero, estado, estrellas, stock, capitulos) VALUES (?,?,?,?,?,?,?,?);
                """;

        PreparedStatement pst = connection.prepareStatement(sql);

        pst.setString(1, manhwa.getIdObra());
        pst.setString(2, manhwa.getTitulo());
        pst.setObject(3, manhwa.getAutor());
        pst.setObject(4, manhwa.getGenero());
        pst.setString(5, manhwa.getEstado());
        pst.setDouble(6, manhwa.getEstrellas());
        pst.setInt(7, manhwa.getStock());
        pst.setInt(8, manhwa.getCapitulo());

        pst.executeUpdate();

        pst.close();
        return result;

    }
    // meter el select de manhwas
}
