import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");



        System.out.println("[---- Calcular quantidade de salário mínimo ----]");
        System.out.println("[--------Digite qual é o seu salário: ----------]");
        double salario = entradaDoUsuario.nextDouble();

        double salarioMinimo = 1212;
        double qtdSalarioMinimo = salario / salarioMinimo;

        System.out.println("[-----------------------------------------------]");
        System.out.println("Você recebe: " + formatador.format(qtdSalarioMinimo) + " salários minimos.");


    }
}
