import java.util.Scanner;
public class AtividadeSala07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();


        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        System.out.println("Digite seu sexo (M) ou (F):");
        char opcao = leia.next().toLowerCase().charAt(0);

        switch (opcao){
            case 'm':
                System.out.println("Seu sexo é masculino");
                break;
            case 'f':
                System.out.println("Seu sexo é feminino");
                break;
        };
    }
}
