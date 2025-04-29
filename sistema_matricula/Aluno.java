package sistema_matricula;

public class Aluno extends Pessoa {
    String matricula, cursoAtual;

    @Override
    public void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso Atual: " + cursoAtual);
    }
}
