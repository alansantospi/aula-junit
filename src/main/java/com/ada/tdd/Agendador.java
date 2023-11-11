package com.ada.tdd;

import java.util.Date;

public class Agendador {
    public Consulta agendarConsulta(Date data, Medico medico, Paciente paciente) {
        Consulta consulta = new Consulta();
        consulta.setData(data);
        consulta.setMedico(medico);
        consulta.setPaciente(paciente);

        return consulta;
    }
}
