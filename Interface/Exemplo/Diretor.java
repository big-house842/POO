package Interface.Exemplo;

public class Diretor extends Funcionario implements Autenticavel{
    
    int senha;
    
    public Diretor(String name, short rent, int senha) {
        super(name, rent);
        this.senha = senha;
    }
    public Diretor() {
        super();
        this.senha = 0;
    }

    @Override
    public boolean autenticacao(int senha) {
        if (senha == 0210) {
            System.out.println("Director Autenticated");
            return true;          
        }else{
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

}
