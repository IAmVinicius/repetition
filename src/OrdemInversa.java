public class OrdemInversa {
    public static void main (String[] args){

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int i = 0; i < (vetor.length); i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");
        for(int e = (vetor.length - 1); e >= 0; e--){
            System.out.print(vetor[e] + " ");
        }
    }
}
