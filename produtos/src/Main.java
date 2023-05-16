import models.Admin;
import models.Cliente;
import models.Produto;
import models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import db.ProdutosDB;
import db.UsuariosDB;

public class Main {
    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuariosDB usuariosDB = new UsuariosDB();
    
    public static void main(String[] args) throws Exception {
        System.out.println("--- PEDIDO DE VENDAS ---");

        Integer option;

        do {
            System.out.println("");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("3 - Cadastrar usuário ADMINISTRADOR");
            System.out.println("4 - Cadastrar usuário CLIENTE");
            System.out.println("5 - Listar todos usuários cadastrados");
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
                System.out.print("Qual o preço do produto? ");
                Double preco = scanner.nextDouble();
                System.out.print("Qual a data da validade do produto? ");
                String dataString = scanner.next();
                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
        
                Produto novoProduto = new Produto(descricao, preco, dataValidade);

                produtosDB.addNovoProduto(novoProduto);
                break;
            }
            case 2: {
                List<Produto> listaDeProdutos = produtosDB.getProdutosList();
                System.out.println("--------------------");
                for (Produto produto: listaDeProdutos) {
                    
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
            case 3: {
                Scanner scanner= new Scanner(System.in);

                System.out.println("");
                System.out.print("Qual o nome do usuário ADMINISTRADOR? ");
                String nome = scanner.nextLine();

                Admin novoAdmin = new Admin(nome);

                usuariosDB.addNovoUsuario(novoAdmin);
                break;
            }
            case 4: {
                Scanner scanner= new Scanner(System.in);

                System.out.println("");
                System.out.print("Qual o nome do usuário CLIENTE? ");
                String nome = scanner.nextLine();

                Cliente novoCliente = new Cliente(nome);

                usuariosDB.addNovoUsuario(novoCliente);
                break;
            }
            case 5: {
                System.err.println("------------------");

                for(Usuario usuario: usuariosDB.getUsuarioList()) {
                    System.out.println("ID: " + usuario.getId());
                    System.out.println("NOME: " + usuario.getNome());
                    System.out.println("TIPO: " + usuario.getTipoUsuario());
                    System.err.println("------------------");
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
