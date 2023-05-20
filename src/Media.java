//Leia 5 números, indique o maior, a soma e a médias deles
import java.util.Scanner;

public class Media {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int soma = 0;
         int maior = 0;
         int numero;
         int count = 0;

         do{
             System.out.println("numero: ");
             numero = scan.nextInt();
             soma = soma + numero;
             if(numero > 0) maior = numero;
             count = ++count;

         }while(count < 5);

         System.out.println("maior: " + maior);
         System.out.println("media: " + soma / count);
         System.out.println("soma: " + soma );
     }
}