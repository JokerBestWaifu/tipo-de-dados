import java.util.Scanner;
 class MediaDeNotas {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1, n2, media;

        System.out.println("INforme o valor da primeira nota: ");
        n1 =  input.nextInt();

        System.out.println("Informe o valor da segunda nota: ");
        n2 = input.nextInt();
        
        media = (n1 + n2)/2;

        System.out.printf("A Média entre " + n1);
        System.out.printf(" e " + n2);
        System.out.printf(" é igual a " + media + "\n");

        if (media >= 8 && media <=10){
            System.out.println("Você está aprovado");
        } else if (media >= 0 && media<= 7){
            System.out.println("Você reprovou");
        } else {
            System.out.println("Valor invalido");
        }
    }
}
