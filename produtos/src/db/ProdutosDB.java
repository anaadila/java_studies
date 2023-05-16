package db;

import java.util.ArrayList;
import java.util.List;

import models.Produto;

public class ProdutosDB {
    private List<Produto> produtosList = new ArrayList<>();

    public List<Produto> getProdutosList() {
        return produtosList;
    }

    public void addNovoProduto(Produto produto) {
        Integer id = produtosList.size() + 1;
        produto.setId(id);
        produtosList.add(produto);
    }
}
