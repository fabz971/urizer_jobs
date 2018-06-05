package dao;

import java.sql.SQLException;
import java.util.List;

public interface Trabajo_Clasificacion {

    void create(Trabajo_Clasificacion cla) throws SQLException;

    List<Trabajo_Clasificacion> read() throws SQLException;

    void update(Trabajo_Clasificacion cla) throws SQLException;

    void delete(Trabajo_Clasificacion id) throws SQLException;
}
