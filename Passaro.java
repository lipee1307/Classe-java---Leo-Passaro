public class Passaro {
    // Atributos (Estado)
    private String nome;
    private String especie;
    private int idade;
    private boolean estaVoando;

    // Construtor
    public Passaro(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.estaVoando = false; // Pássaros começam no chão por padrão
    }

    // Métodos (Comportamentos)
    public void cantar() {
        System.out.println(nome + " está cantando: Chirp chirp! ♪");
    }

    public void decolar() {
        if (!estaVoando) {
            estaVoando = true;
            System.out.println(nome + " bateu as asas e levantou voo!");
        } else {
            System.out.println(nome + " já está no ar.");
        }
    }

    public void pousar() {
        if (estaVoando) {
            estaVoando = false;
            System.out.println(nome + " pousou suavemente em um galho.");
        } else {
            System.out.println(nome + " já está no chão.");
        }
    }

    // Getters e Setters (Para acessar os dados com segurança)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}