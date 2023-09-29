package Clases;

import java.util.ArrayList;
import java.util.List;

public class Crud {
    private List<Usuarios> usuarios = new ArrayList<>();

    public Crud() {
        usuarios.add(new Usuarios(1, "Juan", "Administrador", "juan", "juan56"));
    }

    public void crearUsuario(Usuarios usuario) {
        usuarios.add(usuario);
    }

    public Usuarios leerUsuario(String nomUsario) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getUsuario().equals(nomUsario)) {
                return usuario;
            }
        }
        return null;
    }

    public void actualizarUsuario(Usuarios upsuario) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getUsuario().equals(upsuario.getUsuario())) {
                usuario = upsuario;
            }
        }
    }

    public void eliminarUsuario(String nomUsario) {
        usuarios.removeIf(usuario -> usuario.getUsuario().equals(nomUsario));
    }

    public List<Usuarios> getListUsuarios() {
        return usuarios;
    }
}
