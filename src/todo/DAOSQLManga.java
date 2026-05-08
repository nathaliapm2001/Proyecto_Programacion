import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOSQLManga {

    private Connection conection;

    public DAOSQLManga(DatabaseConnection db) { // desaparece
        conection = db.getConnection();
    }

    public List<Manga> listarMangas() throws SQLException {

        String sql = """
                    SELECT mng.idObra,
                            mng.titulo,
                            mng.autor,
                            mng.genero,
                            mng.estado,
                            mng.estrellas,
                            mng.stock,
                            mng.volumen
                    FROM   Manga mng

                """;

        List<Manga> lista = new ArrayList<>();

        try (Statement stmt = conection.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Manga manga = new Manga(rs.getString("idObra"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("genero"),
                        rs.getString("estado"),
                        rs.getDouble("estrellas"),
                        rs.getInt("stock"),
                        rs.getInt("volumen"));
                lista.add(manga);
            }

        }
        return lista;
    }

    // insertar manga

}
