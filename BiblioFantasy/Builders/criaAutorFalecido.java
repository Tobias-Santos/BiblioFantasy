package Builders;

import Objects.AutorFalecido;

import java.util.Scanner;

public class criaAutorFalecido {
    public static AutorFalecido criadorAutor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Adicione autores!");
        System.out.println("");
        System.out.println("Qual o nome do autor?");
        String nomeAutor = scan.nextLine();
        System.out.println("Qual era a idade do autor?");
        int idadeAutor = scan.nextInt();
        scan.nextLine();
        System.out.println("Escreva algo sobre o autor");
        String descricao = scan.nextLine();
        System.out.println("Escreva o ano de falecimento");
        int anoFalecimento = scan.nextInt();
        scan.nextLine();
        AutorFalecido novoAutor = new AutorFalecido(nomeAutor, idadeAutor, descricao, anoFalecimento);
        return novoAutor;
    }
}
