package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contasBancoAdilaList = new ArrayList<>();

    public List<Conta> getContasBancoAdilaList() {
        return contasBancoAdilaList;
    }

    public void addNovaConta(Conta conta) {
        contasBancoAdilaList.add(conta);
    }
    
    public void tranferir(Conta origem, Conta destino) {
        //
    }

    public Double valorTotal() {
        //
        return 0.0;
    }
}
