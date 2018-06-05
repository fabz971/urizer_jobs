package dao;

import java.sql.SQLException;
import java.util.List;
import model.Clasificacion;

public interface ClasificacionDAO {

    void create(Clasificacion aa) throws SQLException;

    List<Clasificacion> read() throws SQLException;

    void update(Clasificacion aa) throws SQLException;

    void delete(String id) throws SQLException;
}
