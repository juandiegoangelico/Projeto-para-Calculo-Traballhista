package br.com.justrabalhista.Projeto.para.Calculo.Traballhista.model;

public class Passo1 {
    private String nomeCalculo;
    private String cargo;
    private String nomeParte;
    private String dataAdmissao;
    private String dataDemissao;

    public String getNomeCalculo() {
        return nomeCalculo;
    }

    public void setNomeCalculo(String nomeCalculo) {
        this.nomeCalculo = nomeCalculo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNomeParte() {
        return nomeParte;
    }

    public void setNomeParte(String nomeParte) {
        this.nomeParte = nomeParte;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public boolean isFuncionarioAtivo() {
        return funcionarioAtivo;
    }

    public void setFuncionarioAtivo(boolean funcionarioAtivo) {
        this.funcionarioAtivo = funcionarioAtivo;
    }

    public boolean isReconhecimentoVinculo() {
        return reconhecimentoVinculo;
    }

    public void setReconhecimentoVinculo(boolean reconhecimentoVinculo) {
        this.reconhecimentoVinculo = reconhecimentoVinculo;
    }

    private boolean funcionarioAtivo;
    private boolean reconhecimentoVinculo;

    // Getters e setters
    // ...
}
