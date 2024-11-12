package com.example.examen2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;

public class CalculadoraTest {

    // Prueba unitaria para el método 'convertirNumero' con una entrada binaria válida
    @Test
    public void testConvertirNumeroBinario() {
        String input = "1010"; // Representa 10 en decimal
        int base = 0;
        assertEquals(10, Calculadora.convertirNumero(input, base));
    }

    // Prueba unitaria para el método 'convertirNumero' con una entrada hexadecimal válida
    @Test
    public void testConvertirNumeroHexadecimal() {
        String input = "A"; // Representa 10 en decimal
        int base = 3;
        assertEquals(10, Calculadora.convertirNumero(input, base));
    }

    // Prueba unitaria para el método 'realizarOperacion' para la suma
    @Test
    public void testRealizarOperacionSuma() {
        int num1 = 5;
        int num2 = 3;
        String operador = "+";
        assertEquals(8, Calculadora.realizarOperacion(num1, num2, operador));
    }

    // Prueba unitaria para el método 'realizarOperacion' para la división por cero
    @Test(expected = ArithmeticException.class)
    public void testRealizarOperacionDivisionPorCero() {
        int num1 = 5;
        int num2 = 0;
        String operador = "/";
        Calculadora.realizarOperacion(num1, num2, operador);
    }

    // Prueba unitaria para el método 'convertirADestino' para convertir un número a binario
    @Test
    public void testConvertirADestinoBinario() {
        int numeroDecimal = 10;
        int baseDestino = 0;
        assertEquals("1010", Calculadora.convertirADestino(numeroDecimal, baseDestino));
    }

    // Prueba unitaria para el método 'convertirADestino' para convertir un número a hexadecimal
    @Test
    public void testConvertirADestinoHexadecimal() {
        int numeroDecimal = 255;
        int baseDestino = 3;
        assertEquals("ff", Calculadora.convertirADestino(numeroDecimal, baseDestino));
    }
    // Prueba unitaria para el método 'Encuentra' cuando el elemento está presente en la listaa
    @Test
    public void testEncuentraElementoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int elemento = 3;
        assertTrue(Calculadora.Encuentra(lista, elemento));
    }

    // Prueba unitaria para el método 'Encuentra' cuando el elemento no está presente en la lista
    @Test
    public void testEncuentraElementoNoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        int elemento = 6;
        assertFalse(Calculadora.Encuentra(lista, elemento));
    }

}
