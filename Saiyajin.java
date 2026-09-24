// Herança: Saiyajin herda os atributos e métodos de Personagem
public class Saiyajin extends Personagem {

    // Atributo próprio da classe Saiyajin
    private boolean superSaiyajin;

    // Construtor da subclasse chamando o construtor da classe base
    public Saiyajin(String nome, int idade, int nivelDePoder) {
        super(nome, idade, nivelDePoder);
        this.superSaiyajin = false;
    }

    public boolean isSuperSaiyajin() {
        return superSaiyajin;
    }

    public void setSuperSaiyajin(boolean superSaiyajin) {
        this.superSaiyajin = superSaiyajin;
    }

    // Método exclusivo do Saiyajin
    public void virarSuperSaiyajin() {
        superSaiyajin = true;
        setNivelDePoder(getNivelDePoder() * 2);
        System.out.println(getNome() + " se tornou Super Saiyajin! Poder dobrado para " + getNivelDePoder());
    }

    // Reescrita de método
    @Override
    public void atacar() {
        System.out.println(getNome() + " usou o golpe Kamehameha!");
    }
}
