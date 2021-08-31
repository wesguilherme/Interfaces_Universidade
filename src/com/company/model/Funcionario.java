package com.company.model;

public class Funcionario extends Pessoa{

    private String funcao;
    private Double salario;
    private String convenio;

    public Funcionario(String nome, String cpf, String endereco, int idade, String funcao, Double salario, String convenio) {
        super(nome, cpf, endereco, idade);
        this.funcao = funcao;
        this.salario = salario;
        this.convenio = convenio;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
}