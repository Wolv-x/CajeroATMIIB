package ec.edu.epn.cajero.cuenta;
import ec.epn.edu.Tarjeta;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

@RunWith(value = Parameterized.class)
public class TarjetaParametersTest {

    private boolean expected;
    private String numeroTarjeta;
    private String clave;

    public TarjetaParametersTest(String numeroTarjeta, String clave, boolean expected) {
        this.numeroTarjeta = numeroTarjeta;
        this.clave = clave;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{"4271900557374142", "123", true});
        objects.add(new Object[]{"4716050069748111", "672", true});
        objects.add(new Object[]{"4485305457933389", "345", true});
        objects.add(new Object[]{"4278174463982835", "987", true});
        return objects;
    }

    @Test
    public void given_parameters_when_validarTarjeta_then_ok() {
        Tarjeta tarjeta = new Tarjeta();
        assertTrue("", tarjeta.validarTarjeta(numeroTarjeta, clave));
    }
}