import models.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import db.ProdutosDB;

public class Main {
    static ProdutosDB produtosDB = new ProdutosDB();
    
    public static void main(String[] args) throws Exception {
        System.out.println("--- PEDIDO DE VENDAS ---");

        Integer option;

        do {
            System.out.println("");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("0 - Sair");

            Scanner scanner= new Scanner(System.in);
            
            System.out.println("");
            System.out.print("Qual operação você deseja realizar? ");
            option = scanner.nextInt();

            process(option);

        } while(option !=0);
    }

    public static void process(Integer option) throws Exception {
        
        switch (option) {
            case 1: {
                Scanner scanner= new Scanner(System.in);

                System.out.println("");
                System.out.print("Qual a descrição que você deseja dar ao novo produto? ");
                String descricao = scanner.nextLine();
                System.out.print("Qual o ID você deseja dar ao novo produto? ");
                Integer id = scanner.nextInt();
                System.out.print("Qual o preço do produto? ");
                Double preco = scanner.nextDouble();
                System.out.print("Qual a data da validade do produto? ");
                String dataString = scanner.next();
                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
        
                Produto novoProduto = new Produto(id, descricao, preco, dataValidade);

                produtosDB.addNovoProduto(novoProduto);
                break;
            }

            case 2: {
                List<Produto> listaDeProdutos = produtosDB.getProdutosList();

                for (Produto produto: listaDeProdutos) {
                    System.out.println("--------------------");
                    System.out.println("ID do produto: " + produto.getId());
                    System.out.println("Descrição: " + produto.getDescricao());
                    System.out.println("Preço: " + produto.getPreco());
                    System.out.println("Preço arredondado: " + Math.round(produto.getPreco()));
                    System.out.println("Data de Validade: " + produto.getDataValidade());
                    Date hoje = new Date();
                    if(produto.getDataValidade().before(hoje)) {
                        System.err.println("*** CUIDADO - SEU PRODUTO ESTÁ VENCIDO! ***");
                    }
                    System.out.println("--------------------");
                }
                break;
            }
            default: {
                System.out.println("\nOpção inválida.\nEscolha uma das opções listadas, por favor.\n");
                break;
            }
        }
    }
        


}
