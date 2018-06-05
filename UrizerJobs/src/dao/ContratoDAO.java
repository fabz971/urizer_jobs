package dao;

import java.sql.SQLException;
import java.util.List;
import model.Contrato;

public interface ContratoDAO {

    void create(Contrato ac) throws SQLException;

    List<Contrato> read() throws SQLException;

    void update(Contrato ac) throws SQLException;

    void delete(String id) throws SQLException;
}
