package models;

public class Cliente implements Autenticador {
    
    private String nome;
    private Boolean status;
    private String senha;
    private Integer compras;


    public Cliente(String nome, Boolean status, String senha, Integer compras) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getStatus() {
        if (this.status) {
            return "Ativo";
        } else {
            return "Não ativo";
        }
    }

    public Integer getCompras() {
        return this.compras;
    }

    public void setCompras(Integer compras) {
        this.compras = compras;
    }

    @Override
    public Boolean autentica(String senha) {
        if (!(this.senha.equals(senha))) {
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