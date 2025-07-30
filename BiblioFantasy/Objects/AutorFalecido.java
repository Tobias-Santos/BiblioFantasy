package Objects;

public class AutorFalecido extends Autor {

    public AutorFalecido(String nome, int idade, String descricao, int anoFalecimento) {
        super(nome, idade, descricao);
        this.anoFalecimento = anoFalecimento;
    }

    private int anoFalecimento;

    public int getAnoFalecimento() {
        return anoFalecimento;
    }

    public void setAnoFalecimento(int anoFalecimento) {
        this.anoFalecimento = anoFalecimento;
    }
    @Override
    //metódo sobrescrito
    public void apresentar() {
        System.out.println("Sou um autor falecido!");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Ano de Falecimento: " + getAnoFalecimento());
        System.out.println("");
    }

}