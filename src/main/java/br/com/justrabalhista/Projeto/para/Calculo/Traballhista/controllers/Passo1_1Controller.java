package br.com.justrabalhista.Projeto.para.Calculo.Traballhista.controllers;

import br.com.justrabalhista.Projeto.para.Calculo.Traballhista.model.Passo1_1;

public class Passo1_1Controller {
    private Passo1_1 passo1_1;

    public Passo1_1Controller() {
        passo1_1 = new Passo1_1();
    }

    public void setJornadaTrabalhoPrevista(String jornadaTrabalhoPrevista) {
        passo1_1.setJornadaTrabalhoPrevista(jornadaTrabalhoPrevista);
    }

    public void setJornadaTrabalhoExecutada(String jornadaTrabalhoExecutada) {
        passo1_1.setJornadaTrabalhoExecutada(jornadaTrabalhoExecutada);
    }

    // Implemente os demais métodos de configuração dos dados do Passo1_1
    // ...
}