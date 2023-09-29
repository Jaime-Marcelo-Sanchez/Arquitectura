package Clases;

public class Usuarios {
    int id;
    String nombres, rol, usuario, clave;

    public Usuarios() {
    }

    public Usuarios(int id, String nombres, String rol, String usuario, String clave) {
        this.id = id;
        this.nombres = nombres;
        this.rol = rol;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
