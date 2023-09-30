package Clases;

import javax.swing.JOptionPane;

public class Validacion {

    int contadorLetras, contadorNum, intentos;
    boolean validacion = false, logeo = false;
    Crud op = new Crud();
    Usuarios UserOP = new Usuarios();
    Encriptar encriptar = new Encriptar();
    String nuevaClave = "";

    public boolean validarClave(String clave) {
        contadorLetras = 0;
        contadorNum = 0;
        if (clave.length() == 6) {
            /* Verificar que la clave tenga letras minusculas y numeros */
            for (int i = 0; i < clave.length(); i++) {
                if (Character.isLowerCase(clave.charAt(i))) {
                    contadorLetras++;
                }
                if (Character.isDigit(clave.charAt(i))) {
                    contadorNum++;
                }
            }
            if (contadorLetras <= 0 || contadorNum <= 0) {
                JOptionPane.showMessageDialog(null, "La clave debe tener letras minusculas y numeros");
                validacion = false;
            } else {
                validacion = true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "La clave debe tener 6 caracteres");
            validacion = false;
        }
        return validacion;
    }

    public boolean validarUsuario(Usuarios usuario) {
        UserOP = op.leerUsuario(usuario.getUsuario());
        if (UserOP == null) {
            JOptionPane.showMessageDialog(null, "El usuario es incorrecto");
        } else if (UserOP.getEstado().equals("Bloqueado")) {
            JOptionPane.showMessageDialog(null,
                    "Su cuenta fue dado de baja, favor de comunicarse con el administrador");
        } else if (UserOP.getEstado().equals("Desbloqueado")) {
            nuevaClave = JOptionPane.showInputDialog(null, "Ingrese su nueva clave");
            if (validarClave(nuevaClave)) {
                if (encriptar.encriptarClave(nuevaClave).equals(UserOP.getClave())) {
                    JOptionPane.showMessageDialog(null, "La clave no puede ser igual a la anterior");
                } else {
                    UserOP.setClave(encriptar.encriptarClave(nuevaClave));
                    JOptionPane.showMessageDialog(null, "Clave actualizada");
                    UserOP.setEstado("Normal");
                    logeo = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "La clave no cumple con los requisitos");
            }
        } else if (!encriptar.desencriptarClave(UserOP.getClave()).equals(usuario.getClave())) {
            if (!UserOP.getRol().equals("Administrador")) {
                intentos++;
                if ((3 - intentos) == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Su cuenta fue dado de baja, favor de comunicarse con el administrador");
                    UserOP.setEstado("Bloqueado");
                } else {
                    JOptionPane.showMessageDialog(null, "La clave es incorrecta, le quedan " + (3 - intentos));
                }
            } else {
                JOptionPane.showMessageDialog(null, "La clave es incorrecta");
            }
        } else {
            intentos = 0;
            logeo = true;
        }
        return logeo;
    }

    public String getRol(String nomUser) {
        return op.leerUsuario(nomUser).getRol();
    }
}
