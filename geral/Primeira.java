package geral;
import java.util.Scanner;

class Primeira {
    public static void main(String[] args) {
        System.out.println("Curso de Java");


        System.out.println("Oi, qual é o seu nome?");
        Scanner entrada = new Scanner(System.in);
        String s = entrada.next();

        System.out.println("Oi " + s + ", Tudo bem?");

    }
}