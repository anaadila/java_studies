import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cor = "Não definida";

        System.out.println("-------------------");
        System.out.println("Vamos cadastrar o seu carro!");
        System.out.println("---");
        System.out.print("Quantidade de portas: ");
        int numPortas = scanner.nextInt();
        System.out.print("Num do chassi: ");
        String chassi = scanner.next();
        System.out.print("Ano de fabricação: ");
        int anoFabricacao = scanner.nextInt();
        System.out.print("Tipo de combustível: ");
        String combustivel = scanner.next();
        System.out.print("Quantidade de pneus (sem o step): ");
        int quantPneus = scanner.nextInt();

        System.out.println("Você deseja adicionar uma cor ao seu carro? S/N");
        String opcao = scanner.next();

        switch (opcao) {
            case "S":
                System.out.print("Cor do carro: ");
                cor = scanner.next();
                break;
            case "N":
                System.out.println("Obrigado pelas informações! ");
                break;
            default:
                System.out.println("Opção inválida! Encerrando o cadastro.");
        }

        Carro novoCarro = new Carro(numPortas, chassi, anoFabricacao, combustivel, quantPneus);
        novoCarro.setCor(cor);

        System.out.println("-------------------");
        System.out.println("Carro cadastrado com sucesso!");
        System.out.println("---");
        System.out.println("Número de portas: " + novoCarro.getNumPortas());
        System.out.println("Chassi: " + novoCarro.getChassi());
        System.out.println("Ano de fabricação: " + novoCarro.getAnoFabricacao());
        System.out.println("Tipo de combustível: " + novoCarro.getCombustivel());
        System.out.println("Quantidade de pneus (incluindo step): " + novoCarro.getQuantPneus());
        System.out.println("Quantidade de calotas (incluindo do step): " + novoCarro.getQuantCalotas());
        System.out.println(
                "Quantidade de parafusos dos pneus (incluindo do step): " + novoCarro.getQuantParafusosPneus());
        System.out.println("Cor: " + novoCarro.getCor());

    }
}
