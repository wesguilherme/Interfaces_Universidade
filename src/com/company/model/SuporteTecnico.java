package com.company.model;

public class SuporteTecnico extends Pessoa implements AlunosTecnicos {

    private String nivelTecnico;

    public SuporteTecnico(String nome, String cpf, String endereco, int idade, String nivelTecnico) {
        super(nome, cpf, endereco, idade);
        this.nivelTecnico = nivelTecnico;
    }

    @Override
    public void suporteRedes(String nome) {
        System.out.println(nome+"==> Manutenção de Redes");
    }

    @Override
    public void suporteComputadores(String nome) {
        System.out.println(nome+"==> Manutenção de Computadores");
    }

    public String getNivelTecnico() {
        return nivelTecnico;
    }

    public void setNivelTecnico(String nivelTecnico) {
        this.nivelTecnico = nivelTecnico;
    }

}