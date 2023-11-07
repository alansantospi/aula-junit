package com.ada;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerificadorSenhaParameterizedTest {

    @ParameterizedTest(name="Caso {index}: Passando {0} deveria retornar {1}")
//    @CsvFileSource(resources="/dados.csv")
//    @JsonFileSource(resources="/dados.json")
    @MethodSource(value = "obterDados")
    public void testaSenha(String senha, boolean esperado){
        VerificadorSenha verificador = new VerificadorSenha();
        boolean result = verificador.isValida(senha);
        assertEquals(esperado, result);
    }

    public static Collection<?> obterDados(){
        return Arrays.asList(new Object[][] {
                        {null, false},
                        {"", false},
                        {"12345678", false},
                        {"12313assdad", true},
                        {"123456", false},
                        {"sadsad7", false},
                        // ....
                }

        );
    }

}
