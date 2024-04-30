/* Nombre: Fran Vidal Chiclana */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ZappingTest {
    @Test
    void testClicOrigenClicDestino(){
        assertEquals(0, Zapping.buscarCanales(0, 0));
    }
}
