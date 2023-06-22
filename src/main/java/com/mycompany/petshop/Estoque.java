package com.mycompany.petshop;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

        public void adicionarProduto(String nome, int quantidade){
        Produto produto = new Produto(nome, quantidade);
        produtos.add(produto);
        System.out.println("Produto adicionado ao estoque.");
    }

    public void removerProduto(String codigo) {
        Produto produto = buscarProduto(codigo);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido do estoque.");
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void exibirEstoque() {
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("-----------------------");
        }
    }

    public int getQuantidadeDisponivel(String produto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
