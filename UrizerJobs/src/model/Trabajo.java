package model;

public class Trabajo {
//    CREATE TABLE trabajo(-- DROP TABLE perfil
//	id INT AUTO_INCREMENT,
//    descripcion VARCHAR(500),
//    fecha DATETIME,
//    duracion INT,
//    valor INT,
//    empleador_fk INT,
//    PRIMARY KEY(id),
//    FOREIGN KEY (empleador_fk) REFERENCES perfil(id)
//);-- SELECT * FROM trabajo
    
    private int id;
    private String descripcion;
//    private datetime fecha;
    private int duracion;
    private int valor;
    private int empleador_fk;

    public Trabajo() {
    }

    public Trabajo(int id, String descripcion, int duracion, int valor, int empleador_fk) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.valor = valor;
        this.empleador_fk = empleador_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEmpleador_fk() {
        return empleador_fk;
    }

    public void setEmpleador_fk(int empleador_fk) {
        this.empleador_fk = empleador_fk;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", descripcion=" + descripcion + ", duracion=" + duracion + ", valor=" + valor + ", empleador_fk=" + empleador_fk + '}';
    }
    
      
}
