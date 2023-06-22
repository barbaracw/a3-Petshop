package com.mycompany.petshop;

public class Compra {

    private String produto;
    private int quantidade;
    private double precoTotal;

    public Compra(String produto, int quantidade, double precoTotal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

}
