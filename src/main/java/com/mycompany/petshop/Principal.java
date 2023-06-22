package com.mycompany.petshop;

public class Principal {
    
    public static void main(String[] args) {
        CalendarioAgendamento calendario = new CalendarioAgendamento();

        Funcionario funcionario1 = new Funcionario("Rogério");
        Funcionario funcionario2 = new Funcionario("Jerusa");

        calendario.adicionarObserver(funcionario1);
        calendario.adicionarObserver(funcionario2);

        calendario.agendarServico("Banho e Tosa", "Clebinho", "14/06/2023");

        calendario.removerObserver(funcionario2);

        calendario.agendarServico("Consulta Veterinária", "Bob", "21/06/2023");
    }
    
}
