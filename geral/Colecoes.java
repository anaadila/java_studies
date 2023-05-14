package geral;
import java.util.HashSet;
import java.util.Set;

public class Colecoes {
    
    public static void main(String[] args) {
        Set<String> colecao = new HashSet<>();
        colecao.add("Carro");
        colecao.add("Moto");
        
        System.out.println(colecao.add("Barco"));
        System.out.println(colecao.add("Carro"));

        System.err.println("---------------");

        for (String veiculo: colecao) {
            System.out.println(veiculo);
        }

        


    }
}
