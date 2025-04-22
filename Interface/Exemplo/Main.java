package Interface.Exemplo;

public class Main {

    public static void main(String[] args) {

        Gerente jairo = new Gerente();

        Boolean a = verifyManager(jairo);
        printManagerVerified(a);

    }

    private static void printManagerVerified(Boolean a) {

        if () {
            System.out.println("Manager Verified");
        }else{
            System.out.println("Manager not Verified");
        }
    }

    private static Boolean verifyManager(Gerente jairo) {

        jairo.setSenha(0270);

        Autenticavel orangeManager = jairo;

        return orangeManager.autenticacao(jairo.getSenha());
    }

}
