// Classe
public class Personagem {

    // Atributos com visibilidade private (encapsulamento)
    private String nome;
    private int idade;
    private int nivelDePoder;

    // Método construtor
    public Personagem(String nome, int idade, int nivelDePoder) {
        this.nome = nome;
        this.idade = idade;
        this.nivelDePoder = nivelDePoder;
    }

    // Getters e Setters (acesso controlado aos atributos privados)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }

    public void setNivelDePoder(int nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    // Método comum a todos os personagens
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nivel de Poder: " + nivelDePoder);
    }

    // Método que pode ser reescrito pelas subclasses
    public void atacar() {
        System.out.println(nome + " atacou com um golpe basico!");
    }

    // Sobrecarga de método: treinar() sem parametro
    public void treinar() {
        nivelDePoder += 10;
        System.out.println(nome + " treinou sozinho. Novo poder: " + nivelDePoder);
    }

    // Sobrecarga de método: treinar(int horas) com parametro
    public void treinar(int horas) {
        nivelDePoder += horas * 10;
        System.out.println(nome + " treinou por " + horas + " horas. Novo poder: " + nivelDePoder);
    }
}
