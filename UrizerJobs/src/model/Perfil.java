package model;

public class Perfil {
//    CREATE TABLE perfil(-- DROP TABLE perfil
//	id INT AUTO_INCREMENT,
//    mi_descripcion VARCHAR(500),
//    usuario_fk INT,
//    tipo_fk INT,
//    PRIMARY KEY(id),
//    FOREIGN KEY (usuario_fk) REFERENCES usuario(id),
//    FOREIGN KEY (tipo_fk) REFERENCES tipo(id)
//);-- SELECT * FROM perfil
    
    private int id;
    private String mi_descripcion;
    private int usuario_fk;
    private int tipo_fk;

    public Perfil() {
    }

    public Perfil(int id, String mi_descripcion, int usuario_fk, int tipo_fk) {
        this.id = id;
        this.mi_descripcion = mi_descripcion;
        this.usuario_fk = usuario_fk;
        this.tipo_fk = tipo_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMi_descripcion() {
        return mi_descripcion;
    }

    public void setMi_descripcion(String mi_descripcion) {
        this.mi_descripcion = mi_descripcion;
    }

    public int getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(int usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public int getTipo_fk() {
        return tipo_fk;
    }

    public void setTipo_fk(int tipo_fk) {
        this.tipo_fk = tipo_fk;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", mi_descripcion=" + mi_descripcion + ", usuario_fk=" + usuario_fk + ", tipo_fk=" + tipo_fk + '}';
    }
    
    
}
