package dao;

import java.sql.SQLException;
import java.util.List;

public interface Usuario_credencial {
        
    void create(Usuario_credencial usucre) throws SQLException;

    List<Usuario_credencial> read() throws SQLException;

    void update(Usuario_credencial usucre) throws SQLException;

    void delete(Usuario_credencial id) throws SQLException;
}