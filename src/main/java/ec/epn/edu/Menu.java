package ec.epn.edu;

public class Menu {
    private Teclado ingreso;

    public Menu() {
        this.ingreso = new Teclado();
    }

    public void iniciarMenu(Cuenta cuenta, Tarjeta tarjeta) {
        ingreso = new Teclado();
        System.out.println("Ingrese su número de tarjeta: ");
        String numero = ingreso.getEntrada();
        System.out.println("Ingrese su clave: ");
        String clave = ingreso.getEntrada();
        if (tarjeta.validarTarjeta(numero, clave)) {
            String opc;

            do {
                System.out.println("\tMENU");
                System.out.println("1. Retirar dinero");
                System.out.println("2. Salir");
                opc = ingreso.getEntrada();

                if (Teclado.isNumeric(opc)) {
                    switch (Integer.parseInt(opc)) {
                        case 1:
                            System.out.println(cuenta.retirarDinero(numero));
                        case 2:
                            System.out.println("\tGracias por usar nuestros servicios");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                    }
                }
            } while (Integer.parseInt(opc) != 4);
        } else {
            System.out.println("Credenciales erroneas");
            System.out.println("\tGracias por usar nuestros servicios");
            ingreso.cerrarTeclado();
        }

    }
}
