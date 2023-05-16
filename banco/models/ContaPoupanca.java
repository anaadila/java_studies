package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{
    
    private String diaAniversarioString;
    private Double taxaDeJuros;
    private Double limiteSaque;

    public ContaPoupanca(Integer numero, Integer agencia, String banco, Double saldo, String diaAniversarioString, Double taxaDeJuros) {
        super(TipoConta.POUPANCA, numero, agencia, banco, saldo);
        this.diaAniversarioString = diaAniversarioString;
        this.taxaDeJuros = taxaDeJuros;
    }

    public String getDiaAniversarioString() {
        return diaAniversarioString;
    }

    public void setDiaAniversarioString(String diaAniversarioString) {
        this.diaAniversarioString = diaAniversarioString;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getSaldo() {
        return this.saldo + (this.taxaDeJuros*this.saldo);
    }

    public Double sacar(Double saldo) throws ParseException {
        this.limiteSaque = this.saldo * this.taxaDeJuros;
        
        Date diaAniversario = new SimpleDateFormat("dd/MM/yyyy").parse(this.diaAniversarioString);
        Date diaHoje = new Date();

        if (diaAniversario.equals(diaHoje)) {
            this.limiteSaque = this.limiteSaque *2;
        }

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

    @Override
    public String toString() {
        return "Conta {" +
                "numero=" + super.getNumero() +
                ", agencia=" + super.getAgencia() +
                ", banco=\'" + super.getBanco() + '\'' +
                ", saldo=" + getSaldo() +
                ", diaAniversarioString=" + diaAniversarioString +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}
