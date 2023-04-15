public class Carro {

    private int numPortas;
    private String chassi;
    private int anoFabricacao;
    private String combustivel;
    private String cor;
    private int quantPneus;
    private int quantCalotas;
    private int quantParafusosPneus;

    public Carro(int numPortas, String chassi, int anoFabricacao, String combustivel, int quantPneus) {
        this.numPortas = numPortas;
        this.chassi = chassi;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.quantPneus = quantPneus + 1;
        this.quantParafusosPneus = this.quantPneus * 4;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public String getChassi() {
        return chassi;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getQuantPneus() {
        return quantPneus;
    }

    public int getQuantCalotas() {
        quantCalotas = quantPneus;
        return quantCalotas;
    }

    public int getQuantParafusosPneus() {
        quantParafusosPneus = quantPneus * 4;
        return quantParafusosPneus;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
