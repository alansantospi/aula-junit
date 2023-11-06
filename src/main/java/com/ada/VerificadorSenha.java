package com.ada;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificadorSenha {

    /**
     * 1. Mínimo de 8 caracteres
     * 2. Deve conter números
     * 3. Deve conter letras
     * 4. Deve conter caracteres especiais
     */

    private final int TAM = 8;
    public boolean isValida(String senha){
        if (senha == null){
            return false;
        }

        boolean isSizeOk = senha.length() >= TAM;

        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(senha);
        boolean hasDigit = matcher.find();

        pattern = Pattern.compile("[a-z]");
        matcher = pattern.matcher(senha);
        boolean hasLetter = matcher.find();

        return isSizeOk && hasDigit && hasLetter;
    }
}
