package co.com.devco.devco.service;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PersonaServiceItTest {

    @Test
    public void testCuandoMiEdadEsCeroEntoncesLasActividadesSonDeInfante() {
        PersonaService service = new PersonaService();
        String[] expected = {"Correr", "Saltar", "Ir a piscina", "Llorar"};

        String[] resultado = service.obtenerActividadesPorEdad(0);

        assertThat(resultado, is(expected));
    }
}
