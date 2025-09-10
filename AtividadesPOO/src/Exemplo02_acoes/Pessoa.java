package Exemplo02_acoes;

public class Pessoa {
    String nome;
    int idade;

    public void falar() {
        System.out.println("Olá, eu sou o " + this.nome + " e eu tenho " + this.idade + " anos de idade");
    }
}
