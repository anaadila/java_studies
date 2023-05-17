package models;

import java.text.ParseException;

public abstract class Conta {

    private Integer numero;
    private Integer agencia;
    private String banco;
    private TipoConta tipoConta;
    protected Double saldo;

    public Conta(TipoConta tipoConta, Integer numero, Integer agencia, String banco, Double saldo) {
        this.tipoConta = tipoConta;
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
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

    public abstract Double sacar(Double saldo) throws ParseException;

    public abstract Double depositar(Double saldo);

    public String getContaBanco() {
        return this.agencia + "-" + this.numero;
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
