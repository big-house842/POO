package Interface.Exemplo;

public class Gerente extends Funcionario implements Autenticavel{

    int senha;
    
    public Gerente(String name, short rent, int senha) {
        super(name, rent);
        this.senha = senha;
    }
    public Gerente() {
        super();
        this.senha = 0;
    }

    @Override
    public boolean autenticacao(int senha) {
        if (senha == 0270) {
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
