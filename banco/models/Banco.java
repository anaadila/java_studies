package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

    private Map<String, Conta> contasBancoAdilaMap = new HashMap<>();

    public Map<String, Conta> getContasBancoAdilaMap() {
        return contasBancoAdilaMap;
    }

    public List<Conta> getContasBancoAdilaList() {
        List<Conta> contasBancoAdilaList = new ArrayList<>();
        for(Map.Entry<String, Conta> conta: contasBancoAdilaMap.entrySet()) {
            contasBancoAdilaList.add(conta.getValue());
        }

        return contasBancoAdilaList;
    }

    public void addNovaConta(Conta conta) {
        contasBancoAdilaMap.put(conta.getContaBanco(), conta);
    }

    public Conta getContaPorID(String id) {
        return contasBancoAdilaMap.get(id);
    }
    
    public void tranferir(Conta origem, Conta destino) {
        //
    }

    public Double valorTotal() {
        //
        return 0.0;
    }
}
