package geral;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("__________________________");
        System.out.println("|   MENU                 |");
        System.out.println("|   Opções:              |");
        System.out.println("|       1. Opção 1       |");
        System.out.println("|       2. Opção 2       |");
        System.out.println("|       3. Sair          |");
        System.out.println("--------------------------");

        int opcao = getOpcao();

        do {
        switch (opcao) {
            case 1:
                System.out.println("------------------------\nVocê selecionou a opção 1.\n------------------------\n");
                opcao = getOpcao();
                break;
            case 2:
                System.out.println("------------------------\nVocê selecionou a opção 2.\n------------------------\n");
                opcao = getOpcao();
                break;
            case 3:
                System.out.println("Saindo..");
                return;
            default:
                System.out.println("------------------------\nOpção inválida.\n------------------------\n");
                opcao = getOpcao();
                break;
        } } while (opcao != 3);
        System.out.println("Saindo..");
    }

    static int getOpcao() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecinone uma opção: ");
        int opcao = 0;

        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Você inseriu uma opção inválida! Porfavor insira apenas números.");
        }
        
        return opcao;
        };
}
