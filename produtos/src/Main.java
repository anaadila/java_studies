import models.Admin;
import models.Cliente;
import models.Estoque;
import models.PedidoVenda;
import models.Produto;
import models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import db.EstoqueDB;
import db.PedidosVendaDB;
import db.ProdutosDB;
import db.UsuariosDB;

public class Main {
    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuariosDB usuariosDB = new UsuariosDB();
    static EstoqueDB estoqueDB = new EstoqueDB();
    static PedidosVendaDB pedidosVendaDB = new PedidosVendaDB();
    
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
            System.out.println("6 - Cadastrar novo estoque de produtos");
            System.out.println("7 - Listar todos os estoques");
            System.out.println("8 - Criar pedido de venda");
            System.out.println("9 - Listar pedidos de venda");
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
                System.out.println("--- LISTAGEM DE PRODUTOS ---");
                for (Produto produto: listaDeProdutos) {
                    System.out.println("ID do produto: " + produto.getId());
                    System.out.println("Descrição: " + produto.getDescricao());
                    System.out.println("Preço: " + produto.getPreco());
                    System.out.println("Preço arredondado: " + Math.round(produto.getPreco()));
                    System.out.println("Data de Validade: " + produto.getDataValidade());
                    Date hoje = new Date();
                    if(produto.getDataValidade().before(hoje)) {
                        System.out.println("*** CUIDADO - SEU PRODUTO ESTÁ VENCIDO! ***");
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
                System.out.println("--- LISTA DE USUÁRIOS ---");

                for(Usuario usuario: usuariosDB.getUsuarioList()) {
                    System.out.println("ID: " + usuario.getId());
                    System.out.println("NOME: " + usuario.getNome());
                    System.out.println("TIPO: " + usuario.getTipoUsuario());
                    System.out.println("------------------");
                }
                break;
            }
            case 6: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("--- Cadastro de Estoque ---");

                System.out.print("Qual o identificador do estoque: ");
                String id = scanner.next();
                System.out.print("Qual o produto que será adicionado ao estoque (Informe o ID): ");
                Integer produtoId = scanner.nextInt();

                Produto produto = produtosDB.getProdutoPorID(produtoId);
                System.out.println("---");
                System.out.println("Produto ID: " + produto.getId());
                System.out.println("Produto Descrição: " + produto.getDescricao());
                System.out.println("Produto Validade: " + produto.getDataValidade());
                System.out.println("---");

                System.out.print("Qual a quantidade de produtos a ser adicionada em estoque: ");
                Integer quantidade = scanner.nextInt();

                Estoque novoEstoque = new Estoque(id, produto, quantidade);
                estoqueDB.addNovoEstoque(novoEstoque);

                break;
            }
            case 7: {
                System.out.println("--- ESTOQUES CADASTRADOS ---");

                for(Estoque estoque: estoqueDB.getEstoqueList()) {
                    System.out.println("ID: " + estoque.getId());
                    System.out.println("PRODUTO: " + estoque.getProduto().getDescricao());
                    System.out.println("PREÇO: " + estoque.getProduto().getPreco());
                    System.out.println("QUANTIDADE DO PRODUTO: " + estoque.getQuantidade());
                    System.out.println("------------------");
                }
                break;
            }
            case 8: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("");
                System.out.print("Informe o ID do cliente: ");
                Integer idCliente = scanner.nextInt();
                Cliente cliente = (Cliente) usuariosDB.getUsuarioPorID(idCliente);
                System.out.println("ID: " + cliente.getId());
                System.out.println("NOME: " + cliente.getNome());
                System.out.println("TIPO: " + cliente.getTipoUsuario());
                System.out.println("---");

                System.out.print("Informe o ID do estoque: ");
                String idEstoque = scanner.next();
                Estoque estoque = estoqueDB.getEstoqueById(idEstoque);
                System.out.println("Estoque ID: " + estoque.getId());
                System.out.println("Produto Descrição: " + estoque.getProduto().getDescricao());
                System.out.println("Produto Validade: " + estoque.getProduto().getDataValidade());
                System.out.println("---");

                System.out.print("Informe a quantidade a ser vendida: ");
                Integer quantidade = scanner.nextInt();
                PedidoVenda novoPedido = new PedidoVenda(cliente, estoque, quantidade);
                pedidosVendaDB.addNovoPedidoVendas(novoPedido);

                break;
            }
            case 9: {
                System.out.println("--- LISTAGEM DE PEDIDOS DE VENDA ---");
                for (PedidoVenda pedidoVenda: pedidosVendaDB.getPedidoVendas()) {
                    System.out.println("ID do produto: " + pedidoVenda.getId());
                    System.out.println("Cliente: " + pedidoVenda.getCliente().getNome());
                    System.out.println("Produto: " + pedidoVenda.getEstoque().getProduto().getDescricao());
                    System.out.println("Quantidade: " + pedidoVenda.getQuantidade());
                    //System.out.println("Valor Total: " + pedidoVenda.getEstoque().getProduto().getValorTotal());
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
