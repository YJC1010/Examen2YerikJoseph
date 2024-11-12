import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EncuentraTest {

    @Test
    public void testEncuentraElementoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int elemento = 3;
        assertTrue(Encuentra(lista, elemento), "El elemento debería estar en la lista");
    }

    @Test
    public void testEncuentraElementoNoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int elemento = 6;
        assertFalse(Encuentra(lista, elemento), "El elemento no debería estar en la lista");
    }

    @Test
    public void testEncuentraListaVacia() {
        List<Integer> lista = Arrays.asList();
        int elemento = 1;
        assertFalse(Encuentra(lista, elemento), "El elemento no debería estar en una lista vacía");
    }
}
