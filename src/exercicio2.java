import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("[---- Calculo de IMC ----]");
        System.out.println("Insira por favor o seu peso: ");
        double peso = entradaDoUsuario.nextDouble();
        System.out.println("[---- ********* ----]");
        System.out.println("Insira por favor a sua altura: ");
        double altura = entradaDoUsuario.nextDouble();

        System.out.println("[---- Esses são os dados inseridos: ----]");
        System.out.println("O peso digitado é: " + formatador.format(peso) + " kg");
        System.out.println("O altura digitada é: " + formatador.format(altura));

        System.out.println("[---- Vamos para o calculo do IMC ----]");
        double calculoImc = peso / (altura*altura);
        System.out.println("O seu IMC é: " + formatador.format(calculoImc));

       if(calculoImc <= 18.5){
           System.out.println("Você está abaixo do peso Normal");
       }else if(calculoImc > 18.5 && calculoImc <= 24.9){
            System.out.println("Você está no peso Normal");
       }else if(calculoImc >= 25 && calculoImc <= 29.9){
           System.out.println("Você está com excesso de peso");
       }else if(calculoImc >= 30 && calculoImc <= 34.9){
           System.out.println("Você está com obesidade classe I");
       }else if(calculoImc >= 35 && calculoImc <= 39.9){
           System.out.println("Você está com obesidade classe II");
       }else{
           System.out.println("Você está com obesidade classe III");
       }

    }
}
