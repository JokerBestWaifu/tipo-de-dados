import java.util.Scanner;
 class MediaDeNotas {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int Dia;

        System.out.println("Informe um número entre 1 e 7: ");
        Dia =  input.nextInt();


        if (Dia == 1){
            System.out.println("Domingo");
        } else if (Dia == 2){
            System.out.println("Segunda-Feira");
        } else if (Dia == 3){
            System.out.println("Terça-Feira");
        } else if (Dia == 4){
            System.out.println("Quarta-Feira");
        } else if (Dia == 5){
            System.out.println("Quinta-Feira");
        } else if (Dia == 6){
            System.out.println("Sexta-Feira");
        } else if (Dia == 7){
            System.out.println("Sábado");
        }
    }
}
