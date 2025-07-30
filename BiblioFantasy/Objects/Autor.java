package Objects;

import Interface.apresentavel;

public class Autor extends Pessoa implements apresentavel {
    private String descricao;

    public Autor(String nome, int idade, String descricao) {
        super(nome, idade);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
//metódo da interface
    public void apresentar() {
        System.out.println("Sou um autor!");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("");
    }
}


