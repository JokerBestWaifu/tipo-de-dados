import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1, n2, soma;

        System.out.println("INforme o valor do primeiro numero: ");
        n1 =  input.nextInt();

        System.out.println("Informe o valor do segundo numero: ");
        n2 = input.nextInt();
        
        soma = n1 + n2;

        System.out.printf("A Soma de " + n1);
        System.out.printf(" + " + n2);
        System.out.printf(" é igual a " + soma + "\n");

    }
    
}
