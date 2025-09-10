package Exemplo03;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = "Cauã";
        this.idade = 19;
    }

    public int getIdade(int valor) {
        return this.idade;
    }

    public void setIdade(int valor) {
        this.idade = idade;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void falar() {
        System.out.println("Olá, eu sou o " + this.nome + " e eu tenho " + this.idade + " anos de idade");
    }
}
