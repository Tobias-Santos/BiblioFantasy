import java.util.Scanner;

public class ProgramaInformativo {
    public static void informativo(){
      final String compare = "r";
      String renew = "r";
      String complementoDeFrase = "é o autor(a) de ";  
      String senhorDosAnéis = "Tolkien ";
      String cronicasDeNarnia = "C.S Lewis ";
      String cancaoDeGeloFogo = "G.R.R Martin ";
      int anoTolkien = 1937;
      int anoLewis = 1949;
      int anoMartin = 1996;
      int antigo = 0;
      
         if(anoTolkien<anoLewis&&anoTolkien<anoMartin){
           antigo = anoTolkien;
        }
         else if(anoLewis<anoTolkien&&anoLewis<anoMartin){
            antigo = anoLewis;
        }
         else if(anoMartin<anoTolkien&&anoMartin<anoLewis){
            antigo = anoMartin;
        }

       System.out.println(cancaoDeGeloFogo+complementoDeFrase+"A canção de gelo e fogo");
       System.out.println(cronicasDeNarnia+complementoDeFrase+"As crônicas de Nárnia");
       System.out.println(senhorDosAnéis+complementoDeFrase+"O senhor dos anéis");
       System.out.println(" ");
       System.out.println("Até então a obra mais antiga é do ano de "+antigo+"!");
       
        
         Scanner scan = new Scanner(System.in);
         int escolha;
          System.out.println("Sobre qual autor você gostaria de ler mais?");
          System.out.println("1 - para selecionar C.S Lewis");
          System.out.println("2 - para selecionar George R R Martin");
          System.out.println("3 - para selecionar J.R.R Tolkien");
            escolha = scan.nextInt();
          switch (escolha){
            case 1:
              System.out.println("Acesse com 'crtl + left click' : https://pt.wikipedia.org/wiki/C._S._Lewis");
              break;
            case 2:
              System.out.println("Acesse com 'crtl + left click': https://pt.wikipedia.org/wiki/George_R._R._Martin");
              break;
            case 3:
              System.out.println("Acesse com 'crtl + left click': https://pt.wikipedia.org/wiki/J._R._R._Tolkien");
              break;
            default:
              System.out.println("O número é inválido, reinicie o programa!");
            }
            while(renew.equals(compare)){       
                System.out.println();
                System.out.println();
                System.out.println("Deseja fazer uma nova operação? (Para sim : y / Para não : n/ Para repetir a pergunta: r)");
                System.out.println();
                renew = scan.next();
            }   

  if(renew.equals("y")){
      informativo();
    }
    scan.close();
  }
}

