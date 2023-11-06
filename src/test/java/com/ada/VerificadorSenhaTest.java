package com.ada;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificadorSenhaTest {

    /**
     * 1. Mínimo de 8 caracteres
     * 2. Deve conter números
     * 3. Deve conter letras
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
}