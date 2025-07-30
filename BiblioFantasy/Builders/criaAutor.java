package Builders;

import Objects.Autor;

import java.util.Scanner;

public class criaAutor {
    public static Autor criadorAutor(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Adicione autores!");
        System.out.println("");
        System.out.println("Qual o nome do autor?");
        String nomeAutor = scan.nextLine();
        System.out.println("Qual a idade do autor?");
        int idadeAutor = scan.nextInt();
        scan.nextLine();
        System.out.println("Escreva algo sobre o autor");
        String descricao = scan.nextLine();
        Autor novoAutor = new Autor(nomeAutor, idadeAutor, descricao);
        return novoAutor;
    }
}
