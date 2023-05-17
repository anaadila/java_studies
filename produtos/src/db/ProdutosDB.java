package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Produto;

public class ProdutosDB {
    private Map<Integer, Produto> produtosMap = new HashMap<>();

    public List<Produto> getProdutosList() {
        List<Produto> produtos = new ArrayList<>();
        for(Map.Entry<Integer, Produto> produto: produtosMap.entrySet()) {
            produtos.add(produto.getValue());
        }
        return produtos;
    }

    public void addNovoProduto(Produto produto) {
        Integer id = produtosMap.size() + 1;
        produto.setId(id);
        produtosMap.put(produto.getId(), produto);
    }

    public Produto getProdutoPorID(Integer id) {
        return produtosMap.get(id);
    }
}
