package com.mycompany.petshop;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private String codigo;
    private List<Produto> produtos;

    public Venda() {
    }

    public Venda(String codigo) {
        this.codigo = codigo;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado à venda.");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido da venda.");
    }

    public void exibirVenda() {
        System.out.println("Código da venda: " + codigo);
        System.out.println("Produtos da venda:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("-----------------------");
        }
    }

    public double calcularDesconto(double valorProduto, double percentualDesconto) {
        double valorComDesconto = valorProduto - percentualDesconto;
        return valorComDesconto;
    }

    public boolean realizarVenda(String produto, int i) {
        if (i > 1) {
            return true;
        } else {
            return false;
        }
    }
}
