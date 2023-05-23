import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("Digite o peso do peixe: ");
        double pesoPeixe = entradaDoUsuario.nextDouble();

        double pesoExcedente = pesoPeixe - 50;

        DecimalFormat formatador = new DecimalFormat("0.00");

        if(pesoExcedente > 0){
            double multaPesoExcedente = pesoExcedente * 4;
            System.out.println("Ele precisa pagar de multa: " + "R$ " + formatador.format(multaPesoExcedente));
        }else{
            System.out.println("Ele Não precisa pagar multa!");
        }
    }
}
