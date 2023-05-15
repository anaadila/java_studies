package models;

public class ContaCorrente extends Conta {

    private Double chequeEspecial;

    public ContaCorrente(Integer numero, Integer agencia, String banco, Double saldo, Double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public Double getSaldo() {
        return this.chequeEspecial + this.saldo;
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
