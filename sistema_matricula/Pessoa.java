package sistema_matricula;

public class Pessoa {
    String nome, cpf, email;

    public String getCpf() {
        return cpf;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
    }
    
}
