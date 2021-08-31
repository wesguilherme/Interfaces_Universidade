package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SuporteTecnico suporteTecnicoC = new SuporteTecnico("Jose", "545433333","Rua das Bananeiras",54,"Pleno");
        suporteTecnicoC.suporteComputadores(suporteTecnicoC.getNome());
        SuporteTecnico suporteTecnicoR = new SuporteTecnico("Ana", "142587425","Rua das Violetas",54,"Junior");
        suporteTecnicoR.suporteRedes(suporteTecnicoR.getNome());
        System.out.println("----------------------------\n");

        Tutores tutores = new Tutores("Maria", "5657576432", "Rua Darci", 37, " Java");
        System.out.println("Tutor(a) "+tutores.getNome()+ " ===>"+tutores.getDisciplina());
        tutores.ensino();

        Alunos alunos = new Alunos("Thiago", "443444444444", "Rua Matriz", 30, " 4556", "Noturno", "A");
        System.out.println("Aluno "+alunos.getNome()+" =====> " + "Matricula =>"+alunos.getMatricula()+"\n");

        Manutencao manutencao = new Manutencao("Rafael", "555555555555", "Rua das rosas", 35, "Furadeira, Martelo, Serrote");
        System.out.println("Manuntenção "+manutencao.getNome() +" =====> "+ "Equipamentos => " +manutencao.getEquipamentos()+"\n");


        Funcionario funcionarios = new Funcionario("João", "6565654444", "Rua das violetas", 59, "Professor", 2500.0, "Bradesco");
        System.out.println("Funcionario " +funcionarios.getNome() + " ===> " +funcionarios.getFuncao());
    }
}