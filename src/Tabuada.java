//Tabuada, usuario escolhe o número
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Qual tabuada deseja saber? ");
            if (scan.hasNextInt()) {

                int tabuada = scan.nextInt();
                int multiplicador = 0;
                long resultado;

                while (multiplicador < 11) {
                    resultado = tabuada * multiplicador;
                    System.out.println(multiplicador + " x " + tabuada + " = " + resultado);

                    multiplicador++;
                }

                System.out.println("Pronto! Ai está a tabuada do " + tabuada);
            } else {
                System.out.println("Por favor, digite um número inteiro");
            }
        }
    }
}
