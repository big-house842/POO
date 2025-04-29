import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        contrato slim = new contrato();
        slim.setValor(0);
        slim.setNomeCliente("jairo");
        slim.setDataAssinatura("03/10/2000");
        slim.setNumero(502);

        List<imprimivel> documentos = new ArrayList<>();
        documentos.add(slim);

        imprimirTudo(documentos);
        contarporTipo(documentos);

    }

    private static void imprimirTudo(List<imprimivel> documentos) {
        System.out.println(contrato.imprimir;
    }
}
