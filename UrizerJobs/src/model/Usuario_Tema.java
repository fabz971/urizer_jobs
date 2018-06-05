package model;

public class Usuario_Tema {
//    CREATE TABLE usuario_tema(-- DROP TABLE usuario_tema
//	id INT AUTO_INCREMENT,
//    usuario_fk INT,
//    tema_fk INT,
//    PRIMARY KEY(id),
//    FOREIGN KEY (usuario_fk) REFERENCES usuario(id),
//    FOREIGN KEY (tema_fk) REFERENCES tema_interes(id)
//);-- SELECT * FROM usuario_tema
    
    private int id;
    private int usuario_fk;
    private int tema_fk;

    public Usuario_Tema() {
    }

    public Usuario_Tema(int id, int usuario_fk, int tema_fk) {
        this.id = id;
        this.usuario_fk = usuario_fk;
        this.tema_fk = tema_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(int usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public int getTema_fk() {
        return tema_fk;
    }

    public void setTema_fk(int tema_fk) {
        this.tema_fk = tema_fk;
    }

    @Override
    public String toString() {
        return "Usuario_Tema{" + "id=" + id + ", usuario_fk=" + usuario_fk + ", tema_fk=" + tema_fk + '}';
    }
    
    
}
