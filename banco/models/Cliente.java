package models;

public class Cliente implements Autenticador {
    
    private String nome;
    private Boolean status;
    private String senha;


    public Cliente(String nome, Boolean status, String senha) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
    }
    

    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    @Override
    public Boolean autentica(String senha) {
        if (this.senha != senha) {
            System.out.println("Não autenticado!");
            return false;
        } else {
            System.out.println("Autenticado!");
            return true;
        }
    };

    @Override
    public String toString() {
        return "{" +
            " nome='" + nome + "'" +
            ", status='" + status + "'" +
            ", senha='" + senha + "'" +
            "}";
    }

}
