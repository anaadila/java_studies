package geral;

import java.util.HashMap;

public class Colecoes {
    
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("C", "Carro");
        map.put("M", "Moto");
        map.put("B", "Bicicleta");

        System.out.println(map.get("C"));

        map.remove("M");

        System.out.println(map.get("M"));
    }
}
