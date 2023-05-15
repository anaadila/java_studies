import models.Aluno;
import models.Presenca;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import db.AlunosDB;
import db.PresencasDB;

public class Main {
    static AlunosDB alunosDB = new AlunosDB();
    static PresencasDB presencasDB = new PresencasDB();
    static Map<String, Presenca> chamadas = new HashMap<>();

    public static void main(String[] args) throws Exception {
        System.out.println("--- CHAMADA DE ALUNOS ---");

        Integer option;

        do {
            System.out.println("");
            System.out.println("1 - Realizar chamada");
            System.out.println("2 - Cadastrar aluno");
            System.out.println("3 - Lista de alunos");
            System.out.println("4 - Verificar chamada");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);

            System.out.println("");
            System.out.print("Qual operação você deseja realizar? ");
            option = scanner.nextInt();

            process(option);

        } while (option != 0);
    }

    public static void process(Integer option) throws Exception {

        switch (option) {
            case 1: {
                Scanner scanner = new Scanner(System.in);
                Set<Aluno> listaDeAlunos = alunosDB.getAlunosList();
                Set<Aluno> listaDeAlunosPresentes = new HashSet<>();

                System.out.println("");
                System.out.println("--- Chamada ---");
                System.out.println("*Insira a data da chamada de acordo com o padrão: dd/mm/aaaa");
                System.out.print("Data da chamada: ");
                String dataString = scanner.next();

                // Date dataPresenca = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
                System.out.println("Coloque 1 para presente e 0 para ausente");

                for (Aluno aluno : listaDeAlunos) {
                    System.out.print(aluno.getNome() + ": ");
                    int presenca = scanner.nextInt();

                    if (presenca == 1) {
                        listaDeAlunosPresentes.add(aluno);
                    }
                }

                Presenca novaPresenca = new Presenca(dataString, listaDeAlunosPresentes);
                presencasDB.addNovaPresenca(novaPresenca);

                chamadas.put(dataString, novaPresenca);
                break;
            }

            case 2: {
                Scanner scanner = new Scanner(System.in);

                System.out.println("");
                System.out.print("Digite o número da chamada do Aluno: ");
                int id = scanner.nextInt();
                System.out.print("Digite o nome do Aluno: ");
                String nome = scanner.next();
                Aluno novoAluno = new Aluno(id, nome);

                alunosDB.addNovoAluno(novoAluno);
                break;
            }

            case 3: {
                Set<Aluno> listaDeAlunos = alunosDB.getAlunosList();
                System.out.println("");
                System.out.println("--- Lista de Alunos ---");
                for (Aluno aluno : listaDeAlunos) {
                    System.out.println("Aluno: " + aluno.getNome() + " | Número da chamada: " + aluno.getId());
                }
                System.out.println("-----------------------");
                break;
            }
            case 4: {
                for (Map.Entry<String, Presenca> entry : chamadas.entrySet()) {
                    String data = (String) entry.getKey();
                    Presenca presencaValue = entry.getValue();

                    System.out.println("--- Presencas dia " + data + " ---");
                    Set<Aluno> listaPresenca = presencaValue.getAlunos();
                    Set<Aluno> listaDeAlunos = alunosDB.getAlunosList();
                    for (Aluno alunoTodos : listaDeAlunos) {

                        for (Aluno aluno : listaPresenca) {
                            if (alunoTodos.getNome() == aluno.getNome()) {
                                System.out.println(aluno.getNome() + " - Presente");
                            } else if (alunoTodos.getNome() != aluno.getNome()) {
                                System.out.println(alunoTodos.getNome() + " - Ausente");
                            }

                        }
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
