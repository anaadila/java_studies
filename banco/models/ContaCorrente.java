package models;

public class ContaCorrente extends Conta  implements Tributavel {

    private Double chequeEspecial;
    private Double limiteSaque;

    public ContaCorrente(Integer numero, Integer agencia, String banco, Double saldo, Double chequeEspecial) {
        super(TipoConta.CORRENTE, numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public Double getSaldo() {
        return this.chequeEspecial + this.saldo;
    }

    public Double sacar(Double saldo){
        this.limiteSaque = this.saldo + this.chequeEspecial;
        if (saldo > limiteSaque) {
            System.out.println("***SAQUE NÃO AUTORIZADO***");
        } else if (saldo <= limiteSaque) {
            this.saldo = this.saldo - saldo;
        }
        return this.saldo;
    }

    public Double depositar(Double saldo){
        this.saldo = this.saldo + saldo;
        return this.saldo;
    }

    public Double getValorImposto() {
        return this.getSaldo() * 0.01;
    }

    @Override
    public String toString() {
        return "Conta {" +
                "numero=" + super.getNumero() +
                ", agencia=" + super.getAgencia() +
                ", banco=\'" + super.getBanco() + '\'' +
                ", saldo=" + getSaldo() +
                ", chequeEspecial=" + chequeEspecial +
                '}';
    }
}
