package com.company.model;

public class Alunos extends Pessoa{

    private String matricula;
    private String periodo;
    private String turma;

    public Alunos(String nome, String cpf, String endereco, int idade, String matricula, String periodo, String turma) {
        super(nome, cpf, endereco, idade);
        this.matricula = matricula;
        this.periodo = periodo;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}