package Exemplo01;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        pessoa.nome ="Cauã";
        pessoa.idade =19;

        System.out.println("Seu nome é " + pessoa.nome + " e você tem " + 19 + " anos");

    }

}
