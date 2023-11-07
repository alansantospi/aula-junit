package com.ada.exceptions;

public class UsuarioNaoEncontradoException extends Exception {

    public UsuarioNaoEncontradoException(String login){
        super("Usuário " + login + " não encontrado!");
    }
}