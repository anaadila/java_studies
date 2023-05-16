package db;

import java.util.ArrayList;
import java.util.List;

import models.Conta;

public class ContasDB {
    
    private List<Conta> contasList = new ArrayList<>();

    public List<Conta> getContasList() {
        return contasList;
    }

    public void addNovaConta(Conta conta) {
        contasList.add(conta);
    }

}
