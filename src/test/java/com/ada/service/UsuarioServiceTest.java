package com.ada.service;

import com.ada.Usuario;
import com.ada.exceptions.UsuarioNaoEncontradoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioServiceTest {

    private UsuarioService service;

    @BeforeEach
    public void setUp(){
        service = new UsuarioService();
    }

    @Test
    public void quandoLoginESenhaValidos() throws UsuarioNaoEncontradoException {
        String login = "user1";
        String senha = "pwd1";
        Usuario usuario = service.fazerLogin(login, senha);

        assertNotNull(usuario);
        assertEquals(login, usuario.getLogin());
        assertEquals(senha, usuario.getSenha());
    }

    @Test
    public void quandoSenhaInvalida() throws UsuarioNaoEncontradoException {
        String login = "user1";
        String senha = "pwd123";

        Exception e = assertThrows(UsuarioNaoEncontradoException.class, () -> {
            Usuario usuario = service.fazerLogin(login, senha);
        });
        assertEquals("Usuário user1 não encontrado!", e.getMessage());


    }


}