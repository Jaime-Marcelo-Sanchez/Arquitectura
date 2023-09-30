package Clases;

import javax.swing.JOptionPane;

public class RolCrud {

    private String[] roles = new String[10000];
    static int indice = 1;

    public RolCrud() {
        roles[0] = "Administrador";
        roles[1] = "Empleado";
    }

    public void crearRol(String rol) {
        indice++;
        roles[indice] = rol;
    }

    public String leerRol(String rol) {
        for (String r : roles) {
            if (r.equals(rol)) {
                return r;
            }
        }
        return null;
    }

    public void actualizarRol(int indiceAc, String rol) {
        if (indiceAc == 0) {
            JOptionPane.showMessageDialog(null, "No se puede elditar el rol de Administrador");
        } else if (indiceAc > indice || indiceAc < 0) {
            JOptionPane.showMessageDialog(null, "Indice no valido");
        } else {
            roles[indiceAc] = rol;
        }
    }

    public void eliminarRol(int indiceaux) {
        if (indiceaux == 0) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar el rol de Administrador");
        } else if (indiceaux > indice || indiceaux < 0) {
            JOptionPane.showMessageDialog(null, "No existe el rol");
        } else {
            roles[indiceaux] = null;
            if (indiceaux == indice) {
                indice--;
            }
            if (roles[indiceaux + 1] != null) {
                for (int i = indiceaux; i < indice; i++) {
                    roles[i] = roles[i + 1];
                    if ((i + 1) == indice) {
                        roles[i + 1] = null;
                        indice--;
                    }
                }
            }
        }
    }

    public String[] getRoles() {
        return roles;
    }
}