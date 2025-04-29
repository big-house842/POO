package sistema_matricula;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome, codigo;
    int cargaHoraria;
    professor prof = new professor();
    List<Aluno> alunos = new ArrayList<>();

    public void atribuirProfessor(professor p){
        prof = p;
    }

    public void adicionarAluno(Aluno a){
        alunos.add(a);
    }

    public void listarParticipantes(){
        System.out.println("Alunos: ");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).nome);
        }
        System.out.println("Professor: ");
        System.out.println(prof);
    }
}
