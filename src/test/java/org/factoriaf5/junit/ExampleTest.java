package org.factoriaf5.junit;

import java.util.List;

import java.util.Arrays;
import java.util.Collections;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExampleTest {

        @Test
    public void testSumar() {
        Example example =  new Example(); 
        // Given - Teniendo
        int num1 = 35; // parametros
        int num2 = 79;

        // When - Cuando
        int result = example.sumar(num1, num2);

        // Then - Entonces
        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
void testCheckPositivo() {
    Example example = new Example();
    assertTrue(example.checkPositivo(5));
}

@Test
void testCheckPositivoLanzaExcepcion() {
    Example example = new Example();
    assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(-1));
}
@Test
void testContarLetrasA() {
    Example example = new Example();
    assertEquals(3, example.contarLetrasA("banana"));
}

@Test
void testContarLetrasAConCadenaVacia() {
    Example example = new Example();
    assertEquals(0, example.contarLetrasA(""));
}

@Test
void testContieneElemento() {
    Example example = new Example();
    List<String> lista = Arrays.asList("manzana", "pera", "uva");
    assertTrue(example.contieneElemento(lista, "pera"));
    assertFalse(example.contieneElemento(lista, "naranja"));
}

@Test
void testRevertirCadena() {
    Example example = new Example();
    assertEquals("avaj", example.revertirCadena("java"));
}

@Test
void testFactorial() {
    Example example = new Example();
    assertEquals(120, example.factorial(5));
}

@Test
void testFactorialLanzaExcepcion() {
    Example example = new Example();
    assertThrows(IllegalArgumentException.class, () -> example.factorial(-5));
}

@Test
void testEsPrimo() {
    Example example = new Example();
    assertTrue(example.esPrimo(7));
    assertFalse(example.esPrimo(4));
}


@Test
void testEsPrimoNumerosNoPrimos() {
    Example example = new Example();
    assertFalse(example.esPrimo(0)); 
    assertFalse(example.esPrimo(1)); 
    assertFalse(example.esPrimo(-5)); 
}

@Test
void testEsPrimoNumerosPrimos() {
    Example example = new Example();
    assertTrue(example.esPrimo(2));  
    assertTrue(example.esPrimo(3));  
}

@Test
void testEsPrimoNumerosNoPrimosPequeños() {
    Example example = new Example();
    assertFalse(example.esPrimo(4));  
    assertFalse(example.esPrimo(9));  
}

@Test
void testEsPrimoNumerosGrandes() {
    Example example = new Example();
    assertTrue(example.esPrimo(17));  
    assertFalse(example.esPrimo(20)); 
}

@Test
void testMensajeConRetraso() throws InterruptedException {
    Example example = new Example();
    assertEquals("Listo después de retraso", example.mensajeConRetraso());
}

@Test
void testConvertirAString() {
    Example example = new Example();
    List<Integer> lista = Arrays.asList(1, 2, 3);
    assertEquals(Arrays.asList("1", "2", "3"), example.convertirAString(lista));
}

@Test
void testCalcularMedia() {
    Example example = new Example();
    List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
    assertEquals(3.0, example.calcularMedia(lista));
}

@Test
void testCalcularMediaLanzaExcepcion() {
    Example example = new Example();
    assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(null));
    assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(Collections.emptyList()));
}

@Test
void testConvertirListaAString() {
    Example example = new Example();
    List<String> lista = Arrays.asList("hola", "mundo", null);
    assertEquals("HOLA,MUNDO,NULL", example.convertirListaAString(lista));
}

}
