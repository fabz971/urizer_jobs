package model;

public class Credencial {
    private int id;
    private String varchar;
    private String descripcion;

    public Credencial() {
    }

    public Credencial(int id, String varchar, String descripcion) {
        this.id = id;
        this.varchar = varchar;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVarchar() {
        return varchar;
    }

    public void setVarchar(String varchar) {
        this.varchar = varchar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Credencial{" + "id=" + id + ", varchar=" + varchar + ", descripcion=" + descripcion + '}';
    }
    
    
}
