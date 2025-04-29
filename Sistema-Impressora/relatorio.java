public class relatorio implements imprimivel{
    String titulo, conteudo, autor, dataCriacao;

    @Override
    public void imprimir() {
        System.out.println("Título: "+ titulo);
        System.out.println("Conteúdo: "+ conteudo);
        System.out.println("Autor: "+ autor);
        System.out.println("Data Criação: "+ dataCriacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
}
