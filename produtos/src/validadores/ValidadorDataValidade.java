package validadores;

import java.util.Calendar;

import models.Estoque;
import models.PedidoVenda;

public class ValidadorDataValidade implements IValidadorPedidoVenda{
    
    @Override
    public String validar(PedidoVenda pedidoVenda) {
        Estoque estoque = pedidoVenda.getEstoque();

        if (Calendar.getInstance().getTime().after(estoque.getProduto().getDataValidade())) {
            return "Produto fora do prazo de validade";
        }

        return null;
    }
}
