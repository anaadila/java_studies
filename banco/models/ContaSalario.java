package models;

public class ContaSalario extends Conta{
    

    public ContaSalario(Integer numero, Integer agencia, String banco, Double saldo) {
        super(numero, agencia, banco, saldo);
    }

    public Double getSaldo() {
        return this.saldo;
    }

}
