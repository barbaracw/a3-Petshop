package com.mycompany.petshop;

import java.util.ArrayList;
import java.util.List;

public class CalendarioAgendamento {

    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.receberNotificacao(mensagem);
        }
    }

    public void agendarServico(String servico, String animal, String data) {

        String mensagem = "Novo agendamento: " + servico + " para o animal " + animal + " na data " + data;
        notificarObservers(mensagem);
    }

}
