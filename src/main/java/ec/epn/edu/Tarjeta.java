package ec.epn.edu;

import java.util.HashMap;

public class Tarjeta {
    HashMap<String, String> tarjetas;
    private final Teclado ingreso;

    public Tarjeta() {
        tarjetas = new HashMap<>();
        ingreso = new Teclado();
        //numeros de cuenta de 6 digitos
        //            clave           contraseña
        tarjetas.put("4271900557374142", "123");
        tarjetas.put("4716050069748111", "672");
        tarjetas.put("4485305457933389", "345");
        tarjetas.put("4278174463982835", "987");
    }


    public boolean validarTarjeta(String numeroTarjeta, String clave) {
        if (numeroTarjeta.length() != 16) {
            return false;
        } else {
            if (clave.length() != 3) {
                return false;
            } else {
                if (Teclado.isNumeric(numeroTarjeta) && Teclado.isNumeric(clave)) {
                    if (tarjetas.containsKey(numeroTarjeta)) {//consultar en BD
                        //unica opcion viable para retornar verdadero
                        return tarjetas.get(numeroTarjeta).equals(clave);
                    }
                }
                return false;
            }
        }
    }

}
