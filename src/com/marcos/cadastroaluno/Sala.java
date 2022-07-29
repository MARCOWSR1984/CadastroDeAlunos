package com.marcos.cadastroaluno;

import java.util.ArrayList;

public class Sala {
  ArrayList<Aluno> listaDeAlunos;

  public Sala (){
    this.listaDeAlunos = new ArrayList<>();
  }

  void inserirAluno(Aluno novoAluno){
    listaDeAlunos.add(novoAluno);
  }

  void listarAlunos() {
    System.out.println("\nLista de alunos");

    for (Aluno alunoNaLista:listaDeAlunos) {
      alunoNaLista.listar();

    }
  }
}
