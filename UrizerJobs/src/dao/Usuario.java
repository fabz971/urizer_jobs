package dao;

import java.sql.SQLException;
import java.util.List;

public interface Usuario {

    void create(Usuario usu) throws SQLException;

    List<Usuario> read() throws SQLException;

    void update(Usuario usu) throws SQLException;

    void delete(Usuario id) throws SQLException;
}
