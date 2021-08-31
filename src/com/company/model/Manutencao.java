package com.company.model;

public class Manutencao extends Pessoa{

    String equipamentos;

    public Manutencao(String nome, String cpf, String endereco, int idade, String equipamentos) {
        super(nome, cpf, endereco, idade);
        this.equipamentos = equipamentos;
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }
}