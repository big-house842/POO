package sistema_endereco;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String nome;
    int idade;
    Endereco endereco = new Endereco();
    List<Telefone> telefones = new ArrayList<>();

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void adicionarTelefone(Telefone telefone){
        telefones.add(telefone);
    }

    public void exibirDadosCompletos(){
        System.out.println("Telefones: ");
        for (int i = 0; i < telefones.size(); i++) {
            System.out.println(telefones.get(i));
            System.out.println("Número: " + telefones.get(i).numero);
            System.out.println("Tipo: " + telefones.get(i).tipo);
        }
        
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);

        System.out.println();
        System.out.println("Rua: " + endereco.rua);
        System.out.println("Cidade: " + endereco.cidade);
        System.out.println("Estado: " + endereco.estado);

    }

}
