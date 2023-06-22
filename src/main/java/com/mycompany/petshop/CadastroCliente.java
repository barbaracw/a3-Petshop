package com.mycompany.petshop;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {

    private List<Cliente> clientes;

    public CadastroCliente() {
        this.clientes = new ArrayList<>();
    }
    
     public static void cadastrarCliente(Cliente cliente) {
  
    }

    public void cadastrarCliente(String nome, String telefone, String CPF, String endereco, String email) {
        Cliente cliente = new Cliente(nome, telefone, CPF, endereco, email);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void exibirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("-----------------------");
        }
    }

    public Cliente buscarCliente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
