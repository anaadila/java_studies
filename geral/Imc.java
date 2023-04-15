package geral;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---- Calculadora IMC ----");
        System.out.print("Peso: ");
        float peso = scanner.nextFloat();
        System.out.print("Altura (cm): ");
        float altura = scanner.nextFloat();
        float imc = calculo(peso, altura);

        System.out.println("O seu IMC é: " + imc);
        if (imc < 18.5) {
            System.out.println("Classificação: Magreza\nObesidade (Grau): 0");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Normal\nObesidade (Grau): 0");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso\nObesidade (Grau): I");
        } else if (imc < 39.9) {
            System.out.println("Classificação: Obesidade\nObesidade (Grau): II");
        } else {
            System.out.println("Classificação: Obesidade Grave\nObesidade (Grau): III");
        }
    }

    public static float calculo (float peso, float altura) {
        float imc = peso / ((altura/100) * (altura/100));
        
        return imc;
    }
}
