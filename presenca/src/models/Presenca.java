package models;

import java.util.Set;


public class Presenca {
    
    private String dia;
    private Set<Aluno> alunos;

    public Presenca(String dia, Set<Aluno> alunos) {
        this.dia = dia;
        this.alunos = alunos;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAluno(Aluno aluno) {
        alunos.add(aluno);
    }

}
