package Exercicio01;

public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada(true, 50, "azul");

        System.out.println("Lampada 1:");
        lampada1.ligar();
        lampada1.aumentarBrilho(30);
        lampada1.mudarCor("vermelho");
        lampada1.reduzirBrilho(10);
        lampada1.desligar();

        System.out.println("\nLampada 2:");
        lampada2.ligar();
        lampada2.reduzirBrilho(20);
        lampada2.mudarCor("verde");
        lampada2.aumentarBrilho(60);
        lampada2.desligar();
    }
}
