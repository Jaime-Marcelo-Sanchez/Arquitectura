package Clases;

<<<<<<< HEAD
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
=======
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
>>>>>>> e23214aaeec2043463d393ad91bfc6c7055879dc

public class Encriptar {
    private static final String LLAVE = "Admin2091";

    public SecretKeySpec crearClave(String llave) {
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            return new SecretKeySpec(cadena, "AES");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static final String claveS = "HolaMundoAccesoDisponible"; // 

    public String encriptarClave(String clave) {
        try {
<<<<<<< HEAD
            SecretKeySpec secretKeySpec = crearClave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] cadena = clave.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadena_encriptada = Base64.getEncoder().encodeToString(encriptada);
            return new String(cadena_encriptada);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
=======
            SecretKeySpec claveSecreta = new SecretKeySpec(claveS.getBytes(), "AES");
            Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cifrador.init(Cipher.ENCRYPT_MODE, claveSecreta);

            byte[] textoEncriptado = cifrador.doFinal(clave.getBytes());
            return Base64.getEncoder().encodeToString(textoEncriptado);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
>>>>>>> e23214aaeec2043463d393ad91bfc6c7055879dc
        }
    }

    public String desencriptarClave(String claveEncriptada) {
        try {
<<<<<<< HEAD
            SecretKeySpec secretKeySpec = crearClave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] cadena = Base64.getDecoder().decode(claveEncriptada);
            byte[] desencriptacion = cipher.doFinal(cadena);
            return new String(desencriptacion, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
=======
            SecretKeySpec claveSecreta = new SecretKeySpec(claveS.getBytes(), "AES");
            Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cifrador.init(Cipher.DECRYPT_MODE, claveSecreta);

            byte[] textoDesencriptado = cifrador.doFinal(Base64.getDecoder().decode(claveEncriptada));
            return new String(textoDesencriptado);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
>>>>>>> e23214aaeec2043463d393ad91bfc6c7055879dc
        }
    }
}

