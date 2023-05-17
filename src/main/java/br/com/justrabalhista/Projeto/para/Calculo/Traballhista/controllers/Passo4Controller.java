package br.com.justrabalhista.Projeto.para.Calculo.Traballhista.controllers;


import br.com.justrabalhista.Projeto.para.Calculo.Traballhista.model.Passo4;

public class Passo4Controller { private Passo4 passo4;

    public void Passo4ControllerController() {
        passo4 = new Passo4();
    }

    public void setJornadaTrabalhoPrevista(String jornadaTrabalhoPrevista) {
        passo4.setJornadaTrabalhoPrevista(jornadaTrabalhoPrevista);
    }

    public void setJornadaTrabalhoExecutada(String jornadaTrabalhoExecutada) {
        passo4.setJornadaTrabalhoExecutada(jornadaTrabalhoExecutada);
    }

    // Implemente os demais métodos de configuração dos dados do Passo1_1
    // ...
}