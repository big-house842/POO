package Interface.Exemplo;

public class Cliente implements Autenticavel{
    
    int senha;

    public Cliente(int senha) {
        this.senha = senha;
    }
    public Cliente() {
        this.senha = 0;
    }    

    @Override
    public boolean autenticacao(int senha) {
        if (senha == 0150) {
            System.out.println("Client Autenticated");
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
