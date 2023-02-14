import java.util.Scanner;
public class InserirObjeto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base, altura, area;

        base =  input.nextInt();
        altura = input.nextInt();
        area = base * altura;

        System.out.printf("A Area de um retangulo de base = " + base);
        System.out.printf("\n a altura é = " + altura);
        System.out.printf("\n é = " + base + "\n");

    }
    
}
