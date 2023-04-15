package geral;
import java.util.Scanner;

public class Endereco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------CADASTRO DE USUÁRIOS-----------");

        System.out.print("Digite o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a rua: ");
        String rua = scanner.nextLine();
        
        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();

        System.out.print("Digite o bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o estado: ");
        String estado = scanner.nextLine();

        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + rua + ", " + numero + " - " + bairro + ", " + cidade + " - " + estado + " - CEP: " + cep);
    }
}
