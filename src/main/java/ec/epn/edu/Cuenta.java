package ec.epn.edu;

import java.util.HashMap;


public class Cuenta {
    HashMap<String, Float> cuenta;
    private final Teclado ingreso;

    public Cuenta() {
        cuenta = new HashMap<>();
        ingreso = new Teclado();
        //Usuarios preestablecidos
        cuenta.put("4271900557374142", 27.2F);
        cuenta.put("4716050069748111", 2.2F);
        cuenta.put("4485305457933389", 7.2F);
        cuenta.put("4278174463982835", 0.2F);
    }


    public String retirarDinero(String numeroTarjeta) {
        System.out.print("Ingrese el monto que desea retirar: ");

        String retorno = "";
        try {
            float dinero = Float.parseFloat(ingreso.getEntrada());

            float saldoResultante = cuenta.get(numeroTarjeta) - dinero;

            if (saldoResultante < 0) {
                retorno = "Saldo insuficiente para realizar la transaccion.";
                return retorno;
            } else {
                cuenta.replace(numeroTarjeta, saldoResultante);
                retorno = "Se ha retirado: $. " + dinero;
                retorno += "\nSaldo restante: $. " + saldoResultante;
                return retorno;
            }
        } catch (NumberFormatException e) {
            System.out.println("INGRESE SOLO NÚMEROS, CERRANDO EL PROGRAMA.....");
            System.exit(0);
        }
        retorno ="Ha ocurrido un error inesperado, no se pudo realizar la transaccion.";
        return retorno;

}

    public static boolean isFloat(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("INGRESE SOLO NÚMEROS, CERRANDO EL PROGRAMA.....");
            System.exit(0);
            return false;
        }
    }

}
