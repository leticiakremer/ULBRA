import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for(int i=0; i< vetorA.length; i++){
            System.out.println("Entre com o valor do Vetor A da posicão: " + i);
            vetorA[i] = scan.nextInt();
        }
        for(int i=0; i< vetorB.length; i++){
            System.out.println("Entre com o valor do vetor B posicão: " + i);
            vetorB[i] = scan.nextInt();
        }

        for(int i=0; i< vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.println("Vetor A = ");
        for(int i = 0; i< vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println("");
        System.out.println("Vetor B = ");
        for(int i = 0; i< vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("Vetor C = ");
        for(int i = 0; i< vetorC.length; i++){
            System.out.println(vetorC[i] + " ");
        }
        System.out.println("");
    }
}

