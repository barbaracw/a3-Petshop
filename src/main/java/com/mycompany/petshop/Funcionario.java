package com.mycompany.petshop;

public class Funcionario implements Observer {

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println(nome + " recebeu a seguinte notificação: " + mensagem);
    }
}
