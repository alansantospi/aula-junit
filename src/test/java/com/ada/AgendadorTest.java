package com.ada.tdd;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
public class AgendadorTest {

    /*
    AGENDADOR DE CONSULTAS
    1. O agendador deve permitir que os pacientes agendem consultas para determinados médicos.
    2. Cada consulta deve ter uma data e um horário.
    3. O agendador deve ser capaz de verificar se um médico está disponível em um determinado horário.
    4. Os pacientes podem cancelar consultas agendadas.
    5. Deve ser possível obter uma lista de consultas agendadas para um determinado médico.
     */

    @Test
    public void testeAgendarConsulta(){
        Agendador agendador = new Agendador();
        Date data = new Date();
        Medico medico = new Medico();
        Paciente paciente = new Paciente();
        Consulta consulta = agendador.agendarConsulta(data, medico, paciente);

        assertEquals(data, consulta.getData());
        assertEquals(paciente, consulta.getPaciente());
        assertEquals(medico, consulta.getMedico());
    }
}
