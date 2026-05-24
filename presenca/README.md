# Presença de Alunos

Aplicação Java simples para registrar presença de alunos em chamadas. O sistema mantém alunos e chamadas em memória durante a execução e permite cadastrar alunos, listar alunos e registrar presenças por data.

## Estrutura do projeto

- `src/Main.java` - ponto de entrada da aplicação e menu de console.
- `src/models/Aluno.java` - modelo de aluno com número e nome.
- `src/models/Presenca.java` - modelo de presença com data e lista de alunos presentes.
- `src/db/AlunosDB.java` - armazena alunos registrados em memória.
- `src/db/PresencasDB.java` - armazena registros de presença em memória.

## Requisitos

- Java 8 ou superior.

## Como compilar

Abra um terminal na pasta `presenca` e execute:

```powershell
javac -d bin src\Main.java src\models\Aluno.java src\models\Presenca.java src\db\AlunosDB.java src\db\PresencasDB.java
```

## Como executar

Ainda na pasta `presenca`:

```powershell
java -cp bin Main
```

## Uso

Ao iniciar, escolha uma das opções:

1. Realizar chamada - registre presença dos alunos em uma data.
2. Cadastrar aluno - adicione um novo aluno à lista.
3. Lista de alunos - exibe todos os alunos cadastrados.
4. Verificar chamada - mostra o status de presença por data.
0. Sair - encerra o programa.

> Observação: os dados não são salvos entre execuções; todos os registros são mantidos apenas em memória enquanto o programa estiver em execução.
