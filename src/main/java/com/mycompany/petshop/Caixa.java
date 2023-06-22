package com.mycompany.petshop;

import java.util.ArrayList;
import java.util.List;

public class Caixa {

    private List<Venda> vendas;

    public Caixa() {
        this.vendas = new ArrayList<>();
    }

    public void realizarVenda(String codigoVenda, List<Produto> produtos) {
        Venda venda = new Venda(codigoVenda);
        for (Produto produto : produtos) {
            venda.adicionarProduto(produto);
        }
        vendas.add(venda);
        System.out.println("Venda realizada com sucesso!");
    }

    public void exibirVendas() {
        for (Venda venda : vendas) {
            venda.exibirVenda();
        }
    }
}
