import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import db.ClientesDB;
import models.Cliente;

public class Main {
    
    static ClientesDB clientesDB = new ClientesDB();
    public static void main(String[] args) {

        System.out.println("--- Contas ---");
        Integer option;

        do {
            System.out.println("");
            System.out.println("1 - Criar cliente");
            System.out.println("2 - Adicionar 10 clientes automaticamente");
            System.out.println("3 - Listas todos os clientes");
            System.out.println("4 - Qual foi o cliente que fez mais compras?");
            System.out.println("5 - Qual foi o cliente que fez menos compras?");
            System.out.println("6 - Qual a média de compras dos clientes da lista?");
            System.out.println("7 - Autenticar cliente");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);

            System.out.println("");
            System.out.print("Qual informação você gostaria de visualizar? ");
            option = scanner.nextInt();

            process(option);
        } while(option !=0);
    }

    public static void process(Integer option) {
        
        switch (option) {
            case 1: {
                Scanner scanner = new Scanner(System.in);
                Boolean clienteAtivo = false;

                System.out.println();
                System.out.println("Preencha as informações abaixo para criação de Cliente");
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Cliente ativa? (1 para ativa e 0 para não ativa): ");
                Integer clienteAtivoOption = scanner.nextInt();
                if (clienteAtivoOption == 1) {
                    clienteAtivo = true;
                }
                System.out.print("Senha: ");
                String senha = scanner.next();
                System.out.print("Quantidade de compras: ");
                Integer compras = scanner.nextInt();

                Cliente novoCliente = new Cliente(nome, clienteAtivo, senha, compras);

                clientesDB.addNovoCliente(novoCliente);

                break;
            }
            case 2: {
                Cliente novoCliente1 = new Cliente("Adila", true, "123", 19);
                Cliente novoCliente2 = new Cliente("Ana", false, "321", 0);
                Cliente novoCliente3 = new Cliente("Jorge", true, "asd", 10);
                Cliente novoCliente4 = new Cliente("Lucas", false, "qwe", 50);
                Cliente novoCliente5 = new Cliente("Ingrid", false, "ewq", 100);
                Cliente novoCliente6 = new Cliente("Jennifer", true, "789", 5);
                Cliente novoCliente7 = new Cliente("Lopes", true, "988", 16);
                Cliente novoCliente8 = new Cliente("Kinha", true, "cvb", 113);
                Cliente novoCliente9 = new Cliente("Bianca", false, "abd", 5);
                Cliente novoCliente10 = new Cliente("Mizzy", false, "abc", 1);

                List<Cliente> novosClientes = Arrays.asList(novoCliente1, novoCliente2, novoCliente3, novoCliente4, novoCliente5, novoCliente6, novoCliente7, novoCliente8, novoCliente9, novoCliente10);

                for(Cliente novoCliente: novosClientes) {
                    clientesDB.addNovoCliente(novoCliente);
                }

                System.out.println("\n10 novos clientes adicionados com sucesso!");

                break;
            }
            case 3: {
                System.out.println("");
                System.out.println("--- LISTANDO TODOS OS CLIENTES ---");

                for(Cliente cliente: clientesDB.getClientesList()) {
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("Status do cliente: " + cliente.getStatus());
                    System.out.println("Senha: " + cliente.getSenha());
                    System.out.println("Quantidade de compras: " + cliente.getCompras());
                    System.out.println("-----");
                }
                break;
            }
            case 4: {
                System.out.println("");
                System.out.println("Cliente que fez mais compras: ");
                System.out.println("Nome: " + clientesDB.getClienteMaxCompras().getNome());
                System.out.println("Quantidade de compras: " + clientesDB.getClienteMaxCompras().getCompras());
                break;
            }
            case 5: {
                System.out.println("");
                System.out.println("Cliente que fez menos compras: ");
                System.out.println("Nome: " + clientesDB.getClienteMinCompras().getNome());
                System.out.println("Quantidade de compras: " + clientesDB.getClienteMinCompras().getCompras());
                break;
            }
            case 6: {
                System.out.println("");
                System.out.println("A média de compras dos clientes é: " + clientesDB.getClienteMediaCompras()) ;
                break;
            }
            case 7: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("");
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Senha: ");
                String senha = scanner.next();

                System.out.println(clientesDB.getClientePorNome(nome).autentica(senha));
            
                break;
            }
        }
    }
    
}