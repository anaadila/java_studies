package geral;

public class Colecoes {
    
    public static void main(String[] args) {
        int[] valores = new int[4];
        valores[0] = 10;
        valores[1] = 15;
        valores[2] = 20;
        valores[3] = 25;

        for (int valor: valores) {
            System.out.println(valor);
        }

        System.out.println("-----------");

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        /*Arrays como os acima, são criados com valor já limitado, as collections como ArrayList, LinkedList e HashSet podem ter valores ilimitados */

    }
}
