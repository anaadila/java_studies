package validadores;

import java.util.ArrayList;
import java.util.List;

import models.PedidoVenda;

public class ValidadorPedidoVenda extends Validador{
    
    private PedidoVenda pedidoVenda;

    public List<IValidadorPedidoVenda> validadoresPedidoVenda = new ArrayList<>();

    public ValidadorPedidoVenda(PedidoVenda pedidoVenda) {
        this.pedidoVenda = pedidoVenda;

        this.validadoresPedidoVenda.add(new ValidadorDataValidade());
        this.validadoresPedidoVenda.add(new ValidadorQuantidade());
    }

    @Override
    public Boolean ehValido() {
        for(IValidadorPedidoVenda validadorPedidoVenda: validadoresPedidoVenda) {
            String erro = validadorPedidoVenda.validar(pedidoVenda);

            if (erro != null) {
                addError(erro);
            }
        }

        return !(getErros().size() > 0);
    }
}
