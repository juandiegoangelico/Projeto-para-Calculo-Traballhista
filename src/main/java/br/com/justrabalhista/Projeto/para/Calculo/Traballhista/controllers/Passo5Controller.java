package br.com.justrabalhista.Projeto.para.Calculo.Traballhista.controllers;


public class Passo5Controller {
    private ModeloPeticaoInicial modeloPeticao;

    public Passo5Controller() {
        modeloPeticao = new ModeloPeticaoInicial();
    }

    public <DadosRecalculados> void gerarPeticao(String nomeArquivo, DadosRecalculados dados) throws InterruptedException {
        modeloPeticao.gerarPeticaoInicial(nomeArquivo, dados);
    }
}
