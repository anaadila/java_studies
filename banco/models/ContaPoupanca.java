package models;

public class ContaPoupanca extends Conta{
    
    private Integer diaAniversario;
    private Double taxaDeJuros;

    public ContaPoupanca(Integer numero, Integer agencia, String banco, Double saldo, Integer diaAniversario, Double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    public Integer getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(Integer diaAniversario) {
        this.diaAniversario = diaAniversario;
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

    @Override
    public String toString() {
        return "Conta {" +
                "numero=" + super.getNumero() +
                ", agencia=" + super.getAgencia() +
                ", banco=\'" + super.getBanco() + '\'' +
                ", saldo=" + getSaldo() +
                ", diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}
