package Clases;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Encriptar {

    private static final String claveS = "HolaMundoAccesoDisponible"; // 

    public String encriptarClave(String clave) {
        try {
            SecretKeySpec claveSecreta = new SecretKeySpec(claveS.getBytes(), "AES");
            Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cifrador.init(Cipher.ENCRYPT_MODE, claveSecreta);

            byte[] textoEncriptado = cifrador.doFinal(clave.getBytes());
            return Base64.getEncoder().encodeToString(textoEncriptado);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String desencriptarClave(String claveEncriptada) {
        try {
            SecretKeySpec claveSecreta = new SecretKeySpec(claveS.getBytes(), "AES");
            Cipher cifrador = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cifrador.init(Cipher.DECRYPT_MODE, claveSecreta);

            byte[] textoDesencriptado = cifrador.doFinal(Base64.getDecoder().decode(claveEncriptada));
            return new String(textoDesencriptado);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

