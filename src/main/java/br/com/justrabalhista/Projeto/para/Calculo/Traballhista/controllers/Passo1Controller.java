package br.com.justrabalhista.Projeto.para.Calculo.Traballhista.controllers;

import br.com.justrabalhista.Projeto.para.Calculo.Traballhista.model.Passo1;

public class Passo1Controller {
    private Passo1 passo1;

    public Passo1Controller() {
        passo1 = new Passo1();
    }

    public void setNomeCalculo(String nomeCalculo) {
        passo1.setNomeCalculo(nomeCalculo);
    }

    public void setCargo(String cargo) {
        passo1.setCargo(cargo);
    }

    // Implemente os demais métodos de configuração dos dados do Passo1
    // ...
}