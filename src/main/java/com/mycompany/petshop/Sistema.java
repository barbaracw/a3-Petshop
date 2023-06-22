package com.mycompany.petshop;

public class Sistema {

    private Estoque estoque;
    private Venda venda;
    private SaudeAnimal saudeAnimal;

    public Sistema() {
        estoque = new Estoque();
        venda = new Venda();
        saudeAnimal = new SaudeAnimal();
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public Venda getVenda() {
        return venda;
    }

    public SaudeAnimal getSaudeAnimal() {
        return saudeAnimal;
    }

    public void cadastrarCliente(Cliente cliente) {
    }

    public void agendarServico(Servico servico) {
    }

    public void registrarCompra(Compra compra) {
    }

    public boolean realizarLogin(String nomeUsuario, String senha) {
        return true; 
    }

}
