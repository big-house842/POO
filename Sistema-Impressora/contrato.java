public class contrato implements imprimivel{
    int numero;
    String nomeCliente, dataAssinatura;
    double valor;

    @Override
    public void imprimir() {
        System.out.println("Número: "+ numero);
        System.out.println("Nome Cliente: "+ nomeCliente);
        System.out.println("Data Assinatura: "+ dataAssinatura);
        System.out.println("Valor: "+ valor);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(String dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
