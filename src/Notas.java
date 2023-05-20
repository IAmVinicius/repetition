import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Digite uma nota de 0 a 10: ");
        nota = scan.nextInt();
        do{
            System.out.println("Nota invalida! Digite novamente: ");
            nota = scan.nextInt();
        }while(nota < 0 || nota >10);
        System.out.println("Parabéns, você digitou a nota " + nota);
    }
}
