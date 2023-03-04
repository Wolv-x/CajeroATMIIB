package ec.edu.epn.cajero.cuenta;
import ec.epn.edu.Teclado;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TecladoTest {
    Teclado teclado = null;
    @Before
    public void setUp() {
        teclado = new Teclado();
        System.out.println("Setup");
    }
    @Test
    public void given_numbers_when_isNumeric_then_ok() {
        assertTrue(teclado.isNumeric("5674839076573246"));
    }

    @Test
    public void given_numbers_when_isNotNull_then() {
        assertNotNull("El objeto no es nulo", teclado);
    }

    @Test
    public void given_numbers_when_isNull_then() {
        teclado = null;
        assertNull("El objeto es nulo", teclado);
    }

}