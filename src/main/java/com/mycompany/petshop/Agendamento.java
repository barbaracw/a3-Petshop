package com.mycompany.petshop;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Agendamento {
    
    private Date data;
    private String descricao;
    private Cliente cliente;
    private String servico;
    private String horario;

    public Agendamento() {
    }

    public Agendamento(Date data, String descricao, Cliente cliente) {
        this.data = data;
        this.descricao = descricao;
        this.cliente = cliente;
    }

    public Agendamento(Sistema sistema) {
    
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getServico() {
        return servico;
    }

    public String getHorario() {
        return horario;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agendarServico(Cliente cliente, Servico servico, LocalDate now, LocalTime of) {
    
    }

    public List<Agendamento> getAgendamento() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Servico buscarServicoAgendado(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
