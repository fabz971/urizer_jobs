package model;

public class Trabajo_Clasificacion {
//    CREATE TABLE trabajo_clasificacion(-- DROP TABLE trabajo_clasificacion
//	id INT AUTO_INCREMENT,
//    trabajo_fk INT,
//    clasificacion_fk INT,
//    PRIMARY KEY(id),
//    FOREIGN KEY (trabajo_fk) REFERENCES trabajo(id),
//    FOREIGN KEY (clasificacion_fk) REFERENCES clasificacion(id)
//);-- SELECT * FROM trabajo_clasificacion
    
    private int id;
    private int trabajo_fk;
    private int clasificacion_fk;

    public Trabajo_Clasificacion() {
    }

    public Trabajo_Clasificacion(int id, int trabajo_fk, int clasificacion_fk) {
        this.id = id;
        this.trabajo_fk = trabajo_fk;
        this.clasificacion_fk = clasificacion_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrabajo_fk() {
        return trabajo_fk;
    }

    public void setTrabajo_fk(int trabajo_fk) {
        this.trabajo_fk = trabajo_fk;
    }

    public int getClasificacion_fk() {
        return clasificacion_fk;
    }

    public void setClasificacion_fk(int clasificacion_fk) {
        this.clasificacion_fk = clasificacion_fk;
    }

    @Override
    public String toString() {
        return "Trabajo_Clasificacion{" + "id=" + id + ", trabajo_fk=" + trabajo_fk + ", clasificacion_fk=" + clasificacion_fk + '}';
    }
    
     
}
