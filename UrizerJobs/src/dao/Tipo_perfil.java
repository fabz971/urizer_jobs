package dao;

import java.sql.SQLException;
import java.util.List;

public interface Tipo_perfil {

    void create(Tipo_perfil at) throws SQLException;

    List<Tipo_perfil> read() throws SQLException;

    void update(Tipo_perfil at) throws SQLException;

    void delete(Tipo_perfil id) throws SQLException;
}
