import java.util.Scanner;

public class imc {
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double Peso, Altura, IMC;

        System.out.println("Seu Peso: ");
        Peso =  input.nextDouble();

        System.out.println("Sua Altura: ");
        Altura = input.nextDouble();
        
        IMC = Peso / (Altura * Altura);

        System.out.printf(" Seu IMC é igual a " + (double)IMC + "\n");
        
        if (IMC < 18.5) {
            System.out.printf("Abaixo do Peso \n");

        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.printf("Peso Normal \n");

        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.printf("Sobrepeso \n");

        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.printf("Obesidade Grau 1 \n");

        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.printf("Obesidade Grau 2 \n");

        } else if (IMC > 40) {
            System.out.printf(" Obesidade Grau 3 (Mórbida) \n" );

        } else {
            System.out.printf("Invalido \n");

        }

    }
    
}
