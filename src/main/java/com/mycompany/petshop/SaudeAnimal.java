package com.mycompany.petshop;

public class SaudeAnimal {

    public void exibirInformacoesSaude(Animal animal) {
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Raça: " + animal.getRaca());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + " kg");
        System.out.println("Altura: " + animal.getAltura() + " cm");

        double imc = animal.calcularIMC();
        System.out.println("IMC: " + imc);

    }

    public void realizarConsulta(Animal animal) {
        System.out.println("Realizando consulta para o animal: " + animal.getNome());

    }

    public void realizarVacina(Animal animal) {
        System.out.println("Realizando vacinação para o animal: " + animal.getNome());

    }

    public double calcularIMC(double peso, double altura) {
        double alturaEmMetros = altura / 100;
        return peso / (alturaEmMetros * alturaEmMetros);
    }

}
