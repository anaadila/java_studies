package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.PedidoVenda;

public class PedidosVendaDB {
    
    private Map<Integer, PedidoVenda> pedidosVendaMap = new HashMap<>();

    public List<PedidoVenda> getPedidoVendas() {
        List<PedidoVenda> pedidosVendaList = new ArrayList<>();

        for(Map.Entry<Integer, PedidoVenda> pedidoVenda: pedidosVendaMap.entrySet()) {
            pedidosVendaList.add(pedidoVenda.getValue());
        }
        return pedidosVendaList;
    }

    public void addNovoPedidoVendas(PedidoVenda novoPedido) {
        Integer id = pedidosVendaMap.size() + 1;
        novoPedido.setId(id);
        pedidosVendaMap.put(novoPedido.getId(), novoPedido);
    }
}
