package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Conta;

public class ContasDB {
    
    private Map<String, Conta> contasDBMap = new HashMap<>();

    public Map<String, Conta> getContasDBMap() {
        return contasDBMap;
    }

    public List<Conta> getContasList() {
        List<Conta> contasDBList = new ArrayList<>();
        for(Map.Entry<String, Conta> conta: contasDBMap.entrySet()) {
            contasDBList.add(conta.getValue());
        }

        return contasDBList;
    }
    

    public void addNovaConta(Conta conta) {
        contasDBMap.put(conta.getContaBanco(), conta);
    }

    public Conta getContaPorID(String id) {
        return contasDBMap.get(id);
    }

    public Double valorTotal() {
        Double saldoTotalBancos = 0.0d;
        for(Conta contaBanco: getContasList()) {
            saldoTotalBancos += contaBanco.getSaldo();
        }
        return saldoTotalBancos;
    }


}
