package models;

public class PedidoVenda {
    
    private Integer id;
    private Cliente cliente;
    private Estoque estoque;
    private Integer quantidade;


    public PedidoVenda(Cliente cliente, Estoque estoque, Integer quantidade) {
        this.cliente = cliente;
        this.estoque = estoque;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estoque getEstoque() {
        return this.estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /*public Double getValorTotal() {
        return quantidade * produto.getPreco();
    }*/

}
