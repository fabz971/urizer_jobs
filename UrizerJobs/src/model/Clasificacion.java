package model;

public class Clasificacion {
    
//    CREATE TABLE clasificacion(-- DROP TABLE clasificacion
//	id INT AUTO_INCREMENT,
//    nombre VARCHAR(50),
//    descripcion VARCHAR(500),
//    PRIMARY KEY(id)
//);-- SELECT * FROM clasificacion
    
    private int id;
    private String nombre;
    private String descripcion;

    public Clasificacion() {
    }

    public Clasificacion(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
