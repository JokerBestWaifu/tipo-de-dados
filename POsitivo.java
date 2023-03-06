import java.util.Scanner;
public class POsitivo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N1;

        N1 =  input.nextInt();
        if (N1 == 0)
        {
            System.out.print("Nulo!");
        } else if (N1 > 0) {
            System.out.print("Positivo!");
        } else if (N1 < 0 ) {
            System.out.print("Negativo!");
        } else {
            System.out.print("Sla!");
        }
    }
    
}