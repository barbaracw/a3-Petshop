package com.mycompany.petshop;

public class Servico {

    private String nome;
    private double preco;

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Servico(String banho_e_Tosa) {
       
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
