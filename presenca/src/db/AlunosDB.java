package db;

import java.util.HashSet;
import java.util.Set;

import models.Aluno;


public class AlunosDB {
    private Set<Aluno> alunosList = new HashSet<>();

    public Set<Aluno> getAlunosList() {
        return alunosList;
    }

    public void addNovoAluno(Aluno aluno) {
        alunosList.add(aluno);
    }
}
