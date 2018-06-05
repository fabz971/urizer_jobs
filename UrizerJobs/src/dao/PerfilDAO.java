package dao;

import java.sql.SQLException;
import java.util.List;
import model.Perfil;

public interface PerfilDAO {

    void create(Perfil ap) throws SQLException;

    List<Perfil> read() throws SQLException;

    void update(Perfil ap) throws SQLException;

    void delete(Perfil id) throws SQLException;

}