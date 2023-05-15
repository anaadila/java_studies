import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("--- Banco ---");

        ContaCorrente cc1 = new ContaCorrente(2, 2, "Banco BB", 15.00, 1.0);
        System.out.println(cc1);



        ContaPoupanca p1 = new ContaPoupanca(3, 3, "Banco CCC", 10.0, 20, 0.05);

        System.out.println(p1);
    }
}
