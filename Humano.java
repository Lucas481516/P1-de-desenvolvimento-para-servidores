// Herança: Humano herda os atributos e métodos de Personagem
public class Humano extends Personagem {

    // Atributo próprio da classe Humano
    private String tecnicaEspecial;

    // Construtor da subclasse chamando o construtor da classe base
    public Humano(String nome, int idade, int nivelDePoder, String tecnicaEspecial) {
        super(nome, idade, nivelDePoder);
        this.tecnicaEspecial = tecnicaEspecial;
    }

    public String getTecnicaEspecial() {
        return tecnicaEspecial;
    }

    public void setTecnicaEspecial(String tecnicaEspecial) {
        this.tecnicaEspecial = tecnicaEspecial;
    }

    // Reescrita de método
    @Override
    public void atacar() {
        System.out.println(getNome() + " usou a tecnica especial: " + tecnicaEspecial + "!");
    }
}
