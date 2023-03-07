import java.util.Scanner;

public class Conversor {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int metro, centimetro;

        System.out.println("Informe o valor em metros para conversão: ");
        metro = input.nextInt();
        
        centimetro = metro * 100;


        System.out.printf(metro + " em centimetro é " + centimetro + "\n");
    }
    
}
