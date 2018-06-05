package model;

public class Usuario {
//    CREATE TABLE usuario(-- DROP TABLE usuario
//	id INT AUTO_INCREMENT,
//    run VARCHAR(50) UNIQUE,
//    nombre VARCHAR(50),
//    correo VARCHAR(500),
//    pass VARCHAR(50),
//    PRIMARY KEY(id),
//);-- SELECT * FROM usuario
    
    private int id;
    private String run;
    private String nombre;
    private String correo;
    private String pass;

    public Usuario() {
    }

    public Usuario(int id, String run, String nombre, String correo, String pass) {
        this.id = id;
        this.run = run;
        this.nombre = nombre;
        this.correo = correo;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", run=" + run + ", nombre=" + nombre + ", correo=" + correo + ", pass=" + pass + '}';
    }
    
    
}
