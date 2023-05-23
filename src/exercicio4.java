import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("[---- Vamos calcular quantos dias você tem de vida? ----]");
        System.out.print("Digite o ano em que nasceu: ");
        int anos = entradaDoUsuario.nextInt();
        System.out.print("Digite o mês que nasceu: ");
        int meses = entradaDoUsuario.nextInt();
        System.out.print("Digite o dia que nasceu: ");
        int dias = entradaDoUsuario.nextInt();

        int idadeTotal = 2023 - anos - 1;
        int totalDias = (idadeTotal * 365) + (meses * 30) + dias;

        System.out.println("[------------------------------------------------------] ");
        System.out.println("Você tem atualmente: " + idadeTotal + " anos," + " que da no total de " + totalDias + " dias.");
    }
}
