package Clases;

public class Usuarios {
    private int id;
    private String nombres, rol, usuario, clave, estado;

    public Usuarios() {
    }

    public Usuarios(int id, String nombres, String rol, String usuario, String clave, String estado) {
        this.id = id;
        this.nombres = nombres;
        this.rol = rol;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
