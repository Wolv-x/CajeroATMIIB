package ec.epn.edu;


public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta();
        Cuenta cuenta = new Cuenta();
        Menu menu = new Menu();
        menu.iniciarMenu(cuenta, tarjeta);
    }
}
