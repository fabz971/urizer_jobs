package model;

public class Contrato {
//    CREATE TABLE contrato(-- DROP TABLE contrato
//	id INT AUTO_INCREMENT,
//    empleado_fk INT,
//    trabajo_fk INT,
//    PRIMARY KEY(id),
//    FOREIGN KEY (empleado_fk) REFERENCES usuario(id),
//    FOREIGN KEY (trabajo_fk) REFERENCES trabajo(id)
//);-- SELECT * FROM contrato
    
    private int id;
    private int empleado;
    private int trabajo_fk;

    public Contrato() {
    }

    public Contrato(int id, int empleado, int trabajo_fk) {
        this.id = id;
        this.empleado = empleado;
        this.trabajo_fk = trabajo_fk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public int getTrabajo_fk() {
        return trabajo_fk;
    }

    public void setTrabajo_fk(int trabajo_fk) {
        this.trabajo_fk = trabajo_fk;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", empleado=" + empleado + ", trabajo_fk=" + trabajo_fk + '}';
    }
    
     
}
