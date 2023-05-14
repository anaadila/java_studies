package geral;
import java.util.ArrayList;

public class Colecoes {
    
    public static void main(String[] args) {
        ArrayList<String> colecao = new ArrayList<>();
        colecao.add("Carro");
        colecao.add("Moto");
        colecao.add("Barco");
        colecao.add("Carro");

        System.out.println(colecao.get(0));
        System.out.println(colecao.get(2));

        System.err.println("---------------");

        for (String veiculo: colecao) {
            System.out.println(veiculo);
        }

        System.err.println("---------------");
        
        colecao.remove(0);

        for (int i = 0; i < colecao.size(); i++) {
            System.err.println(colecao.get(i));
        }

        
    }
}
