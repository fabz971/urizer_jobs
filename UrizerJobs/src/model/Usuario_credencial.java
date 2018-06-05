package model;

public class Usuario_credencial {
//    
//    CREATE TABLE usuario_credencial(-- DROP TABLE usuario_credencial
//	id INT AUTO_INCREMENT,
//    usuario_fk INT,
//    credencial_fk INT,
//    PRIMARY KEY(id),
//    FOREIGN KEY (usuario_fk) REFERENCES usuario(id),
//    FOREIGN KEY (credencial_fk) REFERENCES credencial(id)
//);-- SELECT * FROM usuario_credencial
    
    private int id;
    private int usuario_Fk;
    private String credencial_fk;

    public Usuario_credencial() {
    }

    public Usuario_credencial(int id, int usuario_Fk, String credencial_fk) {
        this.id = id;
        this.usuario_Fk = usuario_Fk;
        this.credencial_fk = credencial_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_Fk() {
        return usuario_Fk;
    }

    public void setUsuario_Fk(int usuario_Fk) {
        this.usuario_Fk = usuario_Fk;
    }

    public String getCredencial_fk() {
        return credencial_fk;
    }

    public void setCredencial_fk(String credencial_fk) {
        this.credencial_fk = credencial_fk;
    }

    @Override
    public String toString() {
        return "Usuario_credencial{" + "id=" + id + ", usuario_Fk=" + usuario_Fk + ", credencial_fk=" + credencial_fk + '}';
    }
    
    
 
}
