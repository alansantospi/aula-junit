package com.ada;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificadorSenhaTest {

    /**
     * 1. Mínimo de 8 caracteres
     * Casos:
     *  1.1. Senha com 7 caracteres -> false
     *  1.2. Senha nula -> false
     *  1.3. Senha vazia -> false
     *  1.4. Senha com 8 caracteres -> true
     *  1.5. Senha com 9 caracteres -> true
     *
     * 2. Deve conter números
     * Casos:
     * 2.1. com numeros -> true
     * 2.2. sem numeros -> false
     *
     * 3. Deve conter letras
     * Casos:
     * 3.1. com letras -> true
     *  3.2. sem letras -> false
     *
     * 4. Deve conter caracteres especiais
     */

    @Test
    public void quandoSenhaMenorQue8_entaoInvalida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = "1234567";
        boolean valida = verificador.isValida(senha);

        Assertions.assertFalse(valida);
    }

    @Test
    public void quandoSenhaNula_entaoInvalida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = null;
        boolean valida = verificador.isValida(senha);

        Assertions.assertFalse(valida);
    }

    @Test
    public void quandoSenhaVazia_entaoInvalida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = "";
        boolean valida = verificador.isValida(senha);

        Assertions.assertFalse(valida);
    }

    @Test
    public void quandoSenhaMaiorQue8_entaoValida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = "12345678a";
        boolean valida = verificador.isValida(senha);

        Assertions.assertTrue(valida);
    }

    @Test
    public void quandoSenhaCom8Caracteres_entaoValida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = "1234567a";
        boolean valida = verificador.isValida(senha);

        Assertions.assertTrue(valida);
    }

    @Test
    public void quandoSenhaContemNumeros_entaoValida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = "abcdefg8";
        boolean valida = verificador.isValida(senha);

        Assertions.assertTrue(valida);
    }

    @Test
    public void quandoSenhaNaoContemNumeros_entaoInvalida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = "abcdefgh";
        boolean valida = verificador.isValida(senha);

        Assertions.assertFalse(valida);
    }

    @Test
    public void quandoSenhaContemLetras_entaoValida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = "a1234567";
        boolean valida = verificador.isValida(senha);

        Assertions.assertTrue(valida);
    }

    @Test
    public void quandoSenhaNaoContemLetras_entaoInvalida(){
        VerificadorSenha verificador = new VerificadorSenha();
        String senha = "13245678";
        boolean valida = verificador.isValida(senha);

        Assertions.assertFalse(valida);
    }
}