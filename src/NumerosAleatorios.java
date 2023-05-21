import java.util.Scanner;
import java.util.Random;
public class NumerosAleatorios {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int [5];
        int[] aleatorios = new int [7];

        for (int a = 0; a < aleatorios.length; a++){

            int aleatorio = random.nextInt(100);
            aleatorios [a] = aleatorio;
        }
        System.out.print("Numero: ");

        for ( int aleatorio : aleatorios ) {
            System.out.print( aleatorio + " ");
        }

        for (int i = 0 ; i <numeros.length ; i++){
            System.out.print("\nnumero: ");
            int numero = scan.nextInt();
            numeros [i] = numero;
        }

        System.out.print("Numeros: ");
        for ( int numero : numeros ) {
            System.out.print(numero + " ");
        }
        System.out.print("sucessore dos numeros: ");
        for ( int numero : numeros ) {
            System.out.print(numero+1 + " ");
        }
    }
}
