package Objects;

public class Livro
{
    
    private String titulo;
   
    private int anoPubli;
   
    private String autor;
    
    private String sinopse;

    private boolean foiLido;


    public Livro(String titulo, int anoPubli, String autor, String sinopse) {
        this.titulo = titulo;
        this.anoPubli = anoPubli;
        this.autor = autor;
        this.sinopse = sinopse;
    }
    public String getTitulo(){
        return this.titulo;
       } 
       public int getAnoPubli(){
        return this.anoPubli;
       }
       public String getAutor(){
        return this.autor;
       }
       public String getSinopse(){
        return this.sinopse;
       }
       public void setTitulo(String titulo) {
        this.titulo = titulo;
       }
       public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
       }
       public void setAutor(String autor) {
        this.autor = autor;
       }
       public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
       }

       public boolean isFoiLido() {
        return foiLido;
       }
        public void setFoiLido(boolean foiLido) {
         this.foiLido = foiLido;
       }
       

   
}
