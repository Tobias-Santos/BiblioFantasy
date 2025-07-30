import Builders.criaAutor;
import Builders.criaAutorFalecido;
import Builders.criaEstante;
import Builders.criaLivro;
import Objects.Autor;
import Objects.Estante;

import java.util.ArrayList;
import java.util.Scanner;


public class ProgramaEstanteVirtual {
 
    public static void AppEstante(){
        ArrayList<Autor> autores = new ArrayList<Autor>();
        ArrayList<Estante> estantes = new ArrayList<Estante>();
        AppEstanteMenu(autores, estantes);
    }
        public static void AppEstanteMenu(ArrayList<Autor> autores, ArrayList<Estante> estantes){
            Scanner scan2 = new Scanner(System.in);
            while (true) {
                System.out.println("----Qual operação deseja fazer ?----");
                System.out.println("-- 1 - Criar uma nova estante --");
                System.out.println("-- 2 - Registrar um autor --");
                System.out.println("-- 3 - Registrar um novo livro --");
                System.out.println("-- 4 - Registrar um autor na lista de falecidos (;-;) --");
                System.out.println("-- 5 - Listar livros adicionados --");
                System.out.println("-- 6 - Ver as apresentações dos autores registrados --");

                int escolha = scan2.nextInt();
                
                    switch (escolha) {
                        case 1:
                            estantes.add(criaEstante.criadorEstante());
                            break;

                        case 2:
                            autores.add(criaAutor.criadorAutor());
                            break;

                        case 3:
                            if(estantes.size() <= 0){
                            System.out.println("Antes de criar um livro crie ao menos uma estante!");
                            }   else{
                                criaLivro.criadorLivro(estantes);
                                }
                            break;

                        case 4:
                            autores.add(criaAutorFalecido.criadorAutor());
                            break;

                        case 5:
                        int size1 = estantes.size();
                            for(int k = 0; k < size1; k++){
                                System.out.println("");
                                estantes.get(k).listarLivros();
                            }
                            break;

                        case 6:
                        int size2 = autores.size();
                            if(autores.size() <= 0){
                                System.out.println("Antes da apresentação tenha ao menos um autor registrado");
                            }
                                for(int k = 0; k < size2; k++){
                                    System.out.println("");
                                    autores.get(k).apresentar();
                                }
                            break;

                        default:
                            break;
                    }
            }
        }
    }