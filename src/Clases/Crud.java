package Clases;

import java.util.ArrayList;
import java.util.List;

public class Crud {
    private static List<Usuarios> usuarios = new ArrayList<>();
    private static int contador = 0;

    public Crud() {
        if (contador == 0) {
            contador++;
            usuarios.add(new Usuarios(1, "Juan", "Administrador", "juan", "FdaWVnDzzWwcYfteuQwMHg==", "Normal")); // Clave
                                                                                                                  // encriptada:
            // "juan56"
        } else {
            // Constructor vacio
        }
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
            if (usuario.getId() == upsuario.getId()) {
                usuario.setEstado(upsuario.getEstado());
                usuario.setClave(upsuario.getClave());
                usuario.setNombres(upsuario.getNombres());
                usuario.setRol(upsuario.getRol());
                usuario.setUsuario(upsuario.getUsuario());
            }
        }
    }

    public void eliminarUsuario(int id) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getId() == id) {
                usuarios.remove(usuario);
                return;
            }
        }
    }

    public List<Usuarios> getListUsuarios() {
        return usuarios;
    }

    /* Que el id no se repita */

    public boolean verificarId(int id) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getId() == id) {
                return true; // El id ya existe
            }
        }
        return false; // El id no existe
    }

    public Usuarios buscarId(int id) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario; // El id coincide
            }
        }
        return null; // El id no coincide
    }
}
