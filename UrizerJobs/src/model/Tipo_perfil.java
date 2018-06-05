package model;

public class Tipo_perfil {    
    private int id;
    private String descripcion;

    public Tipo_perfil() {
    }

    public Tipo_perfil(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return "Tipo_perfil{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
    
}
