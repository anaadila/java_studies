package geral;

import java.util.Map;
import java.util.TreeMap;

public class Colecoes {
    
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("C", "Carro");
        map.put("M", "Moto");
        map.put("B", "Bicicleta");

        System.out.println(map.get("C"));

        map.remove("M");

        System.out.println(map.get("M"));
    }

    /* HashMap tem mais memória e TreeMap é mais perfomático */
}
