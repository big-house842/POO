package sistema_matricula;

public class professor extends Pessoa{
    String titulacao, departamento;

    @Override
    public void exibirDados(){
        System.out.println("Titulação: "+ titulacao);
        System.out.println("Titulação: "+ departamento);
    }
    
}
