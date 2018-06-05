package dao;

import java.sql.SQLException;
import java.util.List;

public interface Trabajo {
    
    void create(Trabajo atra) throws SQLException;

    List<Trabajo> read() throws SQLException;

    void update(Trabajo atra) throws SQLException;

    void delete(Trabajo id) throws SQLException;
}
