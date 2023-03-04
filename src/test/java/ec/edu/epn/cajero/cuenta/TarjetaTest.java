package ec.edu.epn.cajero.cuenta;
import ec.epn.edu.Tarjeta;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TarjetaTest {

    Tarjeta tarjeta = null;
    @Before
    public void setUp() {
        tarjeta = new Tarjeta();
        System.out.println("Setup");
    }

    @Test
    public void given_creditCardNumber_when_validLenghtAndValidPassword_then_OK() {
        assertTrue(tarjeta.validarTarjeta("4271900557374142", "123"));
    }

    @Test
    public void given_creditCardNumber_when_validLenghtAndInvalidPassword_then_OK() {
        assertFalse(tarjeta.validarTarjeta("4271900557374142", "12333123123"));
    }

    @Test
    public void given_creditCardNumberNotNull_when_validLenghtAndInvalidPassword_then_OK() {
        assertNotNull(tarjeta);
    }

}