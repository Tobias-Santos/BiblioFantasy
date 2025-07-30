package Builders;

import Objects.Estante;
import Objects.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class criaLivro {
    public static Livro criadorLivro(ArrayList<Estante> estantes){
            Scanner scan = new Scanner(System.in);
            System.out.println("Insira o nome do livro:");
            String titulo = scan.nextLine();
            System.out.println("Insira o autor do livro:");
            String autor = scan.nextLine();
            System.out.println("Insira o ano de publicação:");
            int anoPubli = scan.nextInt();
            scan.nextLine();
            System.out.println("Insira a sinopse");
            String sinopse = scan.nextLine();
            Livro livro = new Livro(titulo, anoPubli, autor, sinopse);
            System.out.println("Deseja marcar o livro como lido? y/n");
        
                if (scan.next().equals("y"))  {
                    livro.setFoiLido(true);
                }

        adicionadorLivro(estantes, livro);

        
        return livro;
        }
    
    public static ArrayList<Estante> adicionadorLivro(ArrayList<Estante> estantes, Livro livro){
        Scanner scan = new Scanner(System.in);
        System.out.println("Adicione o livro a uma estante!");
        for (int i = 0; i < estantes.size(); i++) {
            System.out.println("A estante que deseja adicionar eh essa? y/n (RESPONDA EXATAMENTE COM ESSES CARACTERES!!)");
            System.out.println(estantes.get(i).getNomeEstante());
            
            if(scan.next().equals("y")){
                estantes.get(i).adicionarLivro(livro);
                break;
            }
            if(i+1 == estantes.size()){
                System.out.println("A operação não foi feita!");
                System.out.println("Deseja ver as estantes novamente?");
                if(scan.next().equals("y")){
                    adicionadorLivro(estantes, livro);
                }
                
            } 
        }

     return estantes; 
    }
    
    //metódo sobrecarregado
    public static ArrayList<Estante> adicionadorLivro(Livro livro, ArrayList<Estante> estantes){
        Scanner scan = new Scanner(System.in);
        System.out.println("Adicione o livro a uma estante!");
        for (int i = 0; i < estantes.size(); i++) {
            System.out.println("A estante que deseja adicionar eh essa? y/n (RESPONDA EXATAMENTE COM ESSES CARACTERES!!)");
            System.out.println(estantes.get(i).getNomeEstante());
            
            if(scan.next().equals("y")){
                estantes.get(i).adicionarLivro(livro);
                break;
            }
            if(i+1 == estantes.size()){
                System.out.println("A operação não foi feita!");
                System.out.println("Deseja ver as estantes novamente?");
                if(scan.next().equals("y")){
                    adicionadorLivro(estantes, livro);
                }
                
            } 
        }

     return estantes; 
    }
}