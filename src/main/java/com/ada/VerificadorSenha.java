package com.ada;

public class VerificadorSenha {

    /**
     * 1. Mínimo de 8 caracteres
     * 2. Deve conter números
     * 3. Deve conter letras
     * 4. Deve conter caracteres especiais
     */

    public boolean isValida(String senha){
        if (senha == null){
            return false;
        }
        if (senha.length() < 8){
            return false;
        }
        return true;
    }
}
