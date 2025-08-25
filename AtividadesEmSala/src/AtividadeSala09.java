import java.util.Scanner;
public class AtividadeSala09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
//        System.out.println("Digite um número inteiro: ");
//        int numero = leia.nextInt();
        boolean sair = false;

        do {
            System.out.println("Escolha uma das opções abaixo");
            System.out.println(
                    "1- Cadastrar novo usuário \n" +
                            "2- Editar usuário \n" +
                            "3- Excluir usuário \n" +
                            "0- Sair "
            );
    int opcao = leia.nextInt();
    switch (opcao){
        case 0:
            sair = true;
            break;
        case 1:
            System.out.println("Cadastrar movo Usuário");
            break;
        case 2:
            System.out.println("Editar Usuário");
            break;
        case 3:
            System.out.println("Excluir Usuário");
            break;
    }
        } while (!sair);
    }
}
