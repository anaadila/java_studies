package geral;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("__________________________");
            System.out.println("|   CALCULADORA          |");
            System.out.println("|   Opções:              |");
            System.out.println("|       1. Somar         |");
            System.out.println("|       2. Subtrair      |");
            System.out.println("|       3. Multiplicar   |");
            System.out.println("|       4. Dividir       |");
            System.out.println("|       5. Sair          |");
            System.out.println("--------------------------");
            System.out.print("O que você deseja fazer?  ");

            opcao = Integer.parseInt(scanner.nextLine());
            processar(opcao);
        } while (opcao != 5);
    
    }

    public static void processar(int opcao) {
        Scanner scanner = new Scanner(System.in);
        
        switch(opcao) {
            case 1: {
                System.out.println("SOMANDO 2 NÚMEROS:");
                System.out.print("Digite o número 1: ");
                float numero1 = scanner.nextFloat();
                System.out.print("Digite o número 2: ");
                float numero2 = scanner.nextFloat();
                float soma = numero1 + numero2;
                System.out.println("A soma dos dois números é: " + soma);
                break;
            }
            case 2: {
                System.out.println("SUBTRAINDO 2 NÚMEROS:");
                System.out.print("Digite o número 1: ");
                float numero1 = scanner.nextFloat();
                System.out.print("Digite o número 2: ");
                float numero2 = scanner.nextFloat();
                float subtracao = numero1 - numero2;
                System.out.println("A subtração dos dois números é: " + subtracao);
                break;
            }
            case 3: {
                System.out.println("MULTIPLICANDO 2 NÚMEROS:");
                System.out.print("Digite o número 1: ");
                float numero1 = scanner.nextFloat();
                System.out.print("Digite o número 2: ");
                float numero2 = scanner.nextFloat();
                float multiplicacao = numero1 * numero2;
                System.out.println("A multiplicação dos dois números é: " + multiplicacao);
                break;
            }
            case 4: {
                System.out.println("DIVIDINDO 2 NÚMEROS:");
                System.out.print("Digite o número 1: ");
                float numero1 = scanner.nextFloat();
                System.out.print("Digite o número 2: ");
                float numero2 = scanner.nextFloat();
                if (numero2 == 0) {
                    System.out.println("Impossível dividir por 0.\n");
                } else {
                    float divisao = numero1 / numero2;
                    System.out.println("A divisão dos dois números é: " + divisao);
                }
                break;
            }
            case 5: {
                System.out.print("Saindo...");
                return;
            }
        }
    }
}
