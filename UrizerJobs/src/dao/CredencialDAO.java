package dao;

import java.sql.SQLException;
import java.util.List;
import model.Credencial;

public interface CredencialDAO {

    void create(Credencial acre) throws SQLException;

    List<Credencial> read() throws SQLException;

    void update(Credencial acre) throws SQLException;

    void delete(Credencial id) throws SQLException;
}
