/* Nombre: Fran Vidal Chiclana */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ZappingTest {
    /* Primer commit */
    @Test
    void testClicOrigenClicDestino(){
        assertEquals(0, Zapping.buscarCanales(0, 0, 0));
    }

    /* Segundo commit */
    @Test
    void testClicOrigenClicDestino2(){
        assertEquals(2, Zapping.buscarCanales(1, 2, 1));
    }

    @Test
    void testClicOrigenClicDestino3(){
        assertEquals(30, Zapping.buscarCanales(10, 30, 20));
    }

    /* Tercer commit & Refactor */
    @Test
    void testClicOrigenClicDestino4(){
        assertEquals(99, Zapping.buscarCanales(2, 99, 2));
    }

    /* Cuarto commit & Refactor */
    @Test
    void testClicOrigenClicDestino5(){
        assertEquals(63, Zapping.buscarCanales(5, 63, 41));
    }
}
