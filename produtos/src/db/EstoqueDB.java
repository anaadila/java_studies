package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Estoque;

public class EstoqueDB {
    private Map<String, Estoque> estoqueDBMap = new HashMap<>();

    public Map<String, Estoque> getEstoqueDBMap() {
        return estoqueDBMap;
    }

    public List<Estoque> getEstoqueList() {
        List<Estoque> estoqueDBList = new ArrayList<>();
        for(Map.Entry<String, Estoque> estoque: estoqueDBMap.entrySet()) {
            estoqueDBList.add(estoque.getValue());
        }
        return estoqueDBList;
    }

    public void addNovoEstoque(Estoque estoque) {
        estoqueDBMap.put(estoque.getId(), estoque);
    }
}
