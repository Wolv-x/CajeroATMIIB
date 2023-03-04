package ec.edu.epn.cajero.cuenta;

import ec.epn.edu.Cuenta;
import ec.epn.edu.Teclado;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CuentaTest {
    Cuenta cuenta = null;
    @Before
    public void setUp() {
        cuenta = new Cuenta();
        System.out.println("Setup");
    }


    @Test
    public void given_Number_when_isFloat_then_ERROR() {
        assertFalse(Teclado.isNumeric("a27.2"));
    }

}

