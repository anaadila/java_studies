package models;

public class ContaSalario extends Conta implements Tributavel {
    
    private Integer quantidadeSaque = 0;

    public ContaSalario(Integer numero, Integer agencia, String banco, Double saldo) {
        super(TipoConta.SALARIO, numero, agencia, banco, saldo);
    }

    public Double getSaldo() {
        return this.saldo - getValorImposto();
    }

    public Double sacar(Double saldo){
        this.quantidadeSaque++;
        if(this.quantidadeSaque > 3) {
            System.out.println("***SAQUE NÃO AUTORIZADO***");
        } else if (this.quantidadeSaque <= 3) {
            this.saldo = this.saldo - saldo;
        }
        return this.saldo;
    }

    public Double depositar(Double saldo){
        this.saldo = this.saldo + saldo;
        return this.saldo;
    }

    public Double getValorImposto() {
        return this.saldo * 0.01;
    }
}
