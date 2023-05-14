package geral;

public class Colecoes {
    
    public static void main(String[] args) {
        int[] valores = new int[4];
        valores[0] = 10;
        valores[1] = 15;
        valores[2] = 20;
        valores[3] = 25;

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }


        int[] valoresReverso = new int[valores.length];
        int posicaoMaxima = valores.length - 1;

        for (int i = posicaoMaxima; i >= 0; i--) {
            valoresReverso[posicaoMaxima - i] = valores[i];
        }

        System.out.println("-------------");

        for (int valor: valoresReverso) {
            System.out.println(valor);
        }

    }
}
