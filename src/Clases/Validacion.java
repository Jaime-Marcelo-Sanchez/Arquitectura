package Clases;

import javax.swing.JOptionPane;

public class Validacion {

    int contadorLetras, contadorNum;
    boolean validacion = false, logeo = false;
    Crud op = new Crud();
    Usuarios UserOP = new Usuarios();

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
        } else if (!UserOP.getClave().equals(usuario.getClave())) {
            JOptionPane.showMessageDialog(null, "La clave es incorrecta");
        } else {
            logeo = true;
        }
        return logeo;
    }

    public String getRol(String nomUser) {
        return op.leerUsuario(nomUser).getRol();
    }
}
