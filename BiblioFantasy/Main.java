import java.util.Scanner;

public class Main
{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      System.out.println("----BiblioFantasy----");
      System.out.println("");
      System.out.println("Qual programa deseja acessar?");
      System.out.println("1- Para o informativo de 3 autores pré-selecionados.");
      System.out.println("2- Para a estante virtual de sinopses.");
      int menu;
      menu = scan.nextInt();
      if(menu == 1){
        ProgramaInformativo.informativo();
      }if(menu == 2){
        ProgramaEstanteVirtual.AppEstante();
      }
      scan.close();       
    }
  
}
