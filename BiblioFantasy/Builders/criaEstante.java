package Builders;

import Objects.Estante;

import java.util.Scanner;

public class criaEstante{
    public static Estante criadorEstante(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome da estante?");
        String nome = scan.nextLine();
        Estante novaEstante = new Estante(nome);
        return novaEstante;
    }
}
