import models.Produto;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Qual a descrição que você deseja dar ao novo produto? ");
        String descricao = scanner.nextLine();
        System.out.print("Qual o ID você deseja dar ao novo produto? ");
        int id = scanner.nextInt();

        Produto novoProduto = new Produto(id, descricao);
        //novoProduto.setDescricao(descricao);
        //novoProduto.setId(id);

        System.out.println("Produto criado com sucesso!");
        System.out.println("----");
        System.out.println("ID do produto: " + novoProduto.getId());
        System.out.println("Seu produto: " + novoProduto.getDescricao());

    }
}
