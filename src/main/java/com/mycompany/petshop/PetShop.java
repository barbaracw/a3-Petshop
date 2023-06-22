package com.mycompany.petshop;

import java.util.ArrayList;
import java.util.List;

public class PetShop {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Animal> animais = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public void exibirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTelefone());
        }
    }

    public void exibirAnimais() {
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Espécie: " + animal.getEspecie());
        }
    }
    
}
