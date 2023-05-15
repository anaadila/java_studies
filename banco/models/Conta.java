package models;

public abstract class Conta {

    private Integer numero;
    private Integer agencia;
    private String banco;
    protected Double saldo;

    public Conta(Integer numero, Integer agencia, String banco, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract Double getSaldo();

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta {" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", banco=\'" + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
