import java.util.Scanner;

public class IdadeMaior {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String n1, n2;
        int i1, i2;

        System.out.println("INforme o valor do primeiro Nome: ");
        n1 =  input.next();

        System.out.println("Informe o valor da primeira idade: ");
        i1 = input.nextInt();

        System.out.println("INforme o valor do segundo Nome: ");
        n2 =  input.next();

        System.out.println("Informe o valor do segunda idade: ");
        i2 = input.nextInt();
        
        if (i1>i2) {
            System.out.printf("A(O) " + n1 + " é mais velha(o) e tem " + i1 + "\n");
        } else if (i2>i1) {
            System.out.printf("A(O) " + n2 + " é mais velha(o) e tem " + i2 + "\n");
        } else if (i1 == i2) {
            System.out.printf( n2 + n1 + " Ambos tem " + i2 + "\n");
        } else {
            System.out.printf("Deu erro \n");
        }
    }
    
}
