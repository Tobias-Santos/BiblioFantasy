package Objects;

import java.util.ArrayList;


public class Estante {
    ArrayList<Livro> livros = new ArrayList<Livro>();
    private String nomeEstante;
    private int numObrasArmazenadas;

        public Estante(String nomeEstante) {
            this.nomeEstante = nomeEstante;
        }
        
        public void setNomeEstante(String nomeEstante){
            this.nomeEstante = nomeEstante;
        }
        public String getNomeEstante() {
            return nomeEstante;
        }
        public void setNumObrasArmazenadas(int numObrasArmazenadas) {
            this.numObrasArmazenadas =  livros.size();
        }
        public int getNumObrasArmazenadas() {
            return numObrasArmazenadas;
        }

    public void listarLivros(){
        setNumObrasArmazenadas(numObrasArmazenadas);
        for(int l = 0; l < numObrasArmazenadas; l++){
            System.out.println(livros.get(l).getTitulo());
        }
    }
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }


}
