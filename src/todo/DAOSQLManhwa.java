package todo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOSQLManhwa {

    private Connection conection;

    public DAOSQLManga(DatabaseConnection db) { //desaparece
        conection = db.getConnection();
    }

    public List<Manhwa> listarManhwas() throws SQLException {

        String sql = """
                    SELECT mnhw.idObra,
                            mnhw.titulo,
                            mnhw.autor,
                            mnhw.genero,
                            mnhw.estado,
                            mnhw.estrellas,
                            mnhw.stock,
                            mnhw.volumen
                    FROM   Manhwa mnhw

                """;

        List<Manhwa> lista = new ArrayList<>();

        try (Statement stmt = conection.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Manhwa manhwa = new Manhwa(rs.getString("idObra"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("genero"),
                        rs.getString("estado"),
                        rs.getDouble("estrellas"),
                        rs.getInt("stock"),
                        rs.getInt("capitulo"));
                lista.add(manhwa);
            }

        }
        return lista;
    }
    // insertar aunque esta en la otra clase SQLManhwa, pero lo dejo aqui para no
    // crear otra clase de DAO
}
