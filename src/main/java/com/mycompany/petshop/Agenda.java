package com.mycompany.petshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {

    private List<Agendamento> agendamentos;

    public Agenda() {
        this.agendamentos = new ArrayList<>();
    }

    public void agendar(Date data, String descricao, Cliente cliente) {
        Agendamento agendamento = new Agendamento(data, descricao, cliente);
        agendamentos.add(agendamento);
        System.out.println("Agendamento realizado com sucesso!");
    }

    public void exibirAgendamentos() {
        for (Agendamento agendamento : agendamentos) {
            System.out.println("Data: " + agendamento.getData());
            System.out.println("Descrição: " + agendamento.getDescricao());
            System.out.println("Cliente: " + agendamento.getCliente().getNome());
            System.out.println("-----------------------");
        }
    }
}
