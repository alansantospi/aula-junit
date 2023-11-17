package com.ada;

import net.joshka.junit.json.params.JsonFileSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraParameterizedTest {

    @ParameterizedTest(name="Caso {index}: Passando {0} e {1} deveria retornar {2}")
//    @CsvFileSource(resources="/dados.csv")
//    @JsonFileSource(resources="/dados.json")
    @MethodSource(value = "obterDados")
    public void testaSoma(int x, int y, int expected){
        com.ada.Calculadora calc = new com.ada.Calculadora();
        int result = calc.somar(x, y);
        assertEquals(expected, result);
    }

    public static Collection<?> obterDados(){
        return Arrays.asList(new Object[][] {
                {3, 5, 8},
                {-2, 7, 5},
                {0, 0, 0},
                {3, 7, 10},
                {-6, 11, 5},
                {4, -10, -6},
                // ....
                }

        );
    }

}