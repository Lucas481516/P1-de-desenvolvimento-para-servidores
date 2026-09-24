public class Main {

    public static void main(String[] args) {

        // Criando os personagens
        Saiyajin goku = new Saiyajin("Goku", 30, 9000);
        Saiyajin vegeta = new Saiyajin("Vegeta", 31, 8500);
        Humano kuririn = new Humano("Kuririn", 30, 1500, "Kienzan");

        System.out.println("===== DADOS DOS PERSONAGENS =====");
        goku.exibirDados();
        System.out.println();
        vegeta.exibirDados();
        System.out.println();
        kuririn.exibirDados();

        // Alterando um atributo usando setter (encapsulamento em ação)
        System.out.println("\n===== ALTERANDO ATRIBUTO COM SETTER =====");
        System.out.println("Idade antiga do Kuririn: " + kuririn.getIdade());
        kuririn.setIdade(31);
        System.out.println("Idade nova do Kuririn: " + kuririn.getIdade());

        // Usando o método sobrecarregado treinar()
        System.out.println("\n===== SOBRECARGA DE METODO (treinar) =====");
        goku.treinar();       // versão sem parâmetro
        vegeta.treinar(5);    // versão com parâmetro (horas)

        // Demonstrando a reescrita de método (atacar)
        System.out.println("\n===== REESCRITA DE METODO (atacar) =====");
        goku.atacar();
        vegeta.atacar();
        kuririn.atacar();

        // Demonstrando herança e polimorfismo: variável do tipo Personagem
        // recebendo objetos das subclasses
        System.out.println("\n===== HERANCA / POLIMORFISMO =====");
        Personagem personagem1 = goku;
        Personagem personagem2 = kuririn;
        personagem1.atacar(); // executa a versão do Saiyajin
        personagem2.atacar(); // executa a versão do Humano

        // Método exclusivo da subclasse Saiyajin
        System.out.println("\n===== METODO EXCLUSIVO DO SAIYAJIN =====");
        vegeta.virarSuperSaiyajin();
        vegeta.atacar();
    }
}
