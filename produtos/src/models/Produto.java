package models;

import java.util.Date;

public class Produto {
    
    private Integer id;
    private String descricao;
    private Double preco;
    private Date dataValidade;

    public Produto(Integer id, String descricao, Double preco, Date dataValidade) {
        this.descricao = descricao;
        this.id = id;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Date getDataValidade() {
        return dataValidade;
    }
}
