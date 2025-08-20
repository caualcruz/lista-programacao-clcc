public class AtividadeSala02 {
    public static void main(String[] args){
        String nome = "Cauã";
        String sobrenome = "Cruz";
        int idade = 18;
        int anoNasc = 2006;
        double peso = 63.5;
        double altura = 1.8;
        double imc = 0;
        imc = peso/(altura*altura);

        System.out.println("Olá " + nome + " " + sobrenome);
        System.out.println("Você nasceu em " + anoNasc + " e tem " + idade + " de idade!");
        System.out.println("Você pesa " + peso + "kg e tem " + altura + " de altura!");
        System.out.println("Seu IMC é de: " + imc);


    }
}