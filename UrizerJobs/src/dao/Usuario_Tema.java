package dao;

import java.sql.SQLException;
import java.util.List;

public interface Usuario_Tema {
    
    void create(Usuario_Tema usute) throws SQLException;

    List<Usuario_Tema> read() throws SQLException;

    void update(Usuario_Tema usute) throws SQLException;

    void delete(Usuario_Tema id) throws SQLException;
}
