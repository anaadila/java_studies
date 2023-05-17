import java.util.List;
import java.util.Scanner;

import db.ContasDB;
import models.Banco;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;
import models.ContaSalario;

public class Main {
    
    static ContasDB contasDB = new ContasDB();
    static Banco contasBancoAdila = new Banco();
    public static void main(String[] args) throws Exception{
        System.out.println("--- Banco ---");
        Integer option;

        do {
            System.out.println("");
            System.out.println("1 - Cadastrar Conta Corrente");
            System.out.println("2 - Cadastrar Conta Poupança");
            System.out.println("3 - Cadastrar Conta Salário");
            System.out.println("4 - Listar Contas");
            System.out.println("5 - Fazer operação com conta");
            System.out.println("6 - Banco Adila");
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
                System.out.print("Banco: ");
                String banco = scanner.next();
                System.out.print("Agência: ");
                Integer agencia = scanner.nextInt();
                System.out.print("Conta: ");
                Integer conta = scanner.nextInt();
                System.out.print("Saldo inicial: ");
                Double saldo = scanner.nextDouble();
                System.out.print("Valor do Cheque especial: ");
                Double chequeEspecial = scanner.nextDouble();

                ContaCorrente novaConta = new ContaCorrente(conta, agencia, banco, saldo, chequeEspecial);

                if (banco.equals("Adila")) {
                    contasBancoAdila.addNovaConta(novaConta);
                } else {
                    contasDB.addNovaConta(novaConta);
                }

                break;
            }
            case 2: {
                Scanner scanner= new Scanner(System.in);
                
                System.out.println("");
                System.out.print("Banco: ");
                String banco = scanner.next();
                System.out.print("Agência: ");
                Integer agencia = scanner.nextInt();
                System.out.print("Conta: ");
                Integer conta = scanner.nextInt();
                System.out.print("Saldo inicial: ");
                Double saldo = scanner.nextDouble();
                System.out.print("Valor da taxa: ");
                Double taxaJuros = scanner.nextDouble();
                System.out.print("Dia de aniversário (DD/MM/AAAA): ");
                String diaAniversario = scanner.next();

                ContaPoupanca novaConta = new ContaPoupanca(conta, agencia, banco, saldo, diaAniversario, taxaJuros);

                if (banco.equals("Adila")) {
                    contasBancoAdila.addNovaConta(novaConta);
                } else {
                    contasDB.addNovaConta(novaConta);
                }
                break;
            }
            case 3: {
                Scanner scanner= new Scanner(System.in);
                
                System.out.println("");
                System.out.print("Banco: ");
                String banco = scanner.next();
                System.out.print("Agência: ");
                Integer agencia = scanner.nextInt();
                System.out.print("Conta: ");
                Integer conta = scanner.nextInt();
                System.out.print("Saldo inicial: ");
                Double saldo = scanner.nextDouble();

                ContaSalario novaConta = new ContaSalario(conta, agencia, banco, saldo);

                if (banco.equals("Adila")) {
                    contasBancoAdila.addNovaConta(novaConta);
                } else {
                    contasDB.addNovaConta(novaConta);
                }
                break;
            }
            case 4: {

                if (contasBancoAdila.getContasBancoAdilaList().size() > 0) {
                    System.err.println("--------------------------");
                    System.err.println("--- CONTAS BANCO ÁDILA ---");
    
                    for(Conta contaBancoAdila: contasBancoAdila.getContasBancoAdilaList()) {
                        System.out.println("Banco: " + contaBancoAdila.getBanco());
                        System.out.println("Tipo da Conta: " + contaBancoAdila.getTipoConta());
                        System.out.println("Agência: " + contaBancoAdila.getAgencia());
                        System.out.println("Conta: " + contaBancoAdila.getNumero());
                        System.out.println("Saldo: " + contaBancoAdila.getSaldo());
                        System.err.println("--------------------------");
                    }
                } else if (contasBancoAdila.getContasBancoAdilaList().isEmpty()) {
                    System.err.println("---------------------------------");
                    System.err.println("--- SEM CONTAS NO BANCO ÁDILA ---");
                }

                if (contasDB.getContasList().size() > 0) {
                    System.err.println("----------------------------");
                    System.err.println("--- CONTAS DEMAIS BANCOS ---");
    
                    for(Conta conta: contasDB.getContasList()) {
                        System.out.println("Banco: " + conta.getBanco());
                        System.out.println("Tipo da Conta: " + conta.getTipoConta());
                        System.out.println("Agência: " + conta.getAgencia());
                        System.out.println("Conta: " + conta.getNumero());
                        System.out.println("Saldo: " + conta.getSaldo());
                        System.err.println("--------------------------");
                    }
                } else if (contasDB.getContasList().isEmpty()) {
                    System.err.println("-------------------------------------");
                    System.err.println("--- SEM CONTAS NOS DEMAIS BANCOS ---");
                    System.err.println("-------------------------------------");
                }
                
                break;
            }
            case 5: {
                Scanner scanner= new Scanner(System.in);
                List<Conta> listaDeContas = contasDB.getContasList();

                System.out.println("");
                System.out.print("Número da conta que deseja realizar a operação: ");
                Integer numConta = scanner.nextInt();

                for (Conta conta: listaDeContas) {
                    if (conta.getNumero().equals(numConta)) {
                        System.out.println("");
                        System.out.println("| 1 - Sacar | 2 - Depositar |");
                        System.out.print("Qual operação deseja fazer (1 ou 2)? ");
                        Integer optionOperacao = scanner.nextInt();
                        System.out.print("Valor: ");
                        Double valor = scanner.nextDouble();

                        if (optionOperacao == 1) {
                            conta.sacar(valor);
                            System.out.println("Saldo restante: " + conta.getSaldo());
                        } else if (optionOperacao == 2) {
                            conta.depositar(valor);
                            System.out.println("Saldo restante: " + conta.getSaldo());
                        }
                        break;
                    }
                }
                break;
            }
            case 6: {
                Scanner scanner= new Scanner(System.in);

                System.out.println("--- BEM VINDO AO BANCO ÁDILA ---");
                System.out.println("Aqui você consegue realizar transferências entre suas contas e visualizar o saldo total do banco (Admin)");

                List<Conta> listaDeContas = contasBancoAdila.getContasBancoAdilaList();

                System.out.println("");
                System.out.print("Número da conta que deseja realizar a operação: ");
                Integer numConta = scanner.nextInt();

                for (Conta conta: listaDeContas) {
                    if (conta.getNumero().equals(numConta)) {
                        System.out.println("");
                        System.out.println("| 1 - Sacar | 2 - Depositar |");
                        System.out.print("Qual operação deseja fazer (1 ou 2)? ");
                        Integer optionOperacao = scanner.nextInt();
                        System.out.print("Valor: ");
                        Double valor = scanner.nextDouble();

                        if (optionOperacao == 1) {
                            conta.sacar(valor);
                            System.out.println("Saldo restante: " + conta.getSaldo());
                        } else if (optionOperacao == 2) {
                            conta.depositar(valor);
                            System.out.println("Saldo restante: " + conta.getSaldo());
                        }
                        break;
                    }
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
