//Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os
//seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo
//elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento
//somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).

public class ex03 {
    public static void main(String[] args) {
        int ultimo = 0;
        int penultimo = 0;

        for (int i = 0; i < 15; i++) {
            int soma = penultimo + ultimo;
            System.out.println(soma);

            if (i < 2) {
                penultimo = 0;
                ultimo = 1;
            } else {
                penultimo = ultimo;
                ultimo = soma;
            }
        }

//        int penultimo = 0;
//        int ultimo = 0;
//        int i = 0;
//
//        while (i < 15) {
//            int soma = penultimo + ultimo;
//            System.out.println(soma);
//
//            if (i < 2) {
//                penultimo = 0;
//                ultimo = 1;
//            } else {
//                penultimo = ultimo;
//                ultimo = soma;
//            }
//            i++;
//        }

//        int penultimo = 0;
//        int ultimo = 0;
//        int i = 0;
//
//        do {
//            int soma = penultimo + ultimo;
//            System.out.println(soma);
//
//            if (i < 2) {
//                penultimo = 0;
//                ultimo = 1;
//            } else {
//                penultimo = ultimo;
//                ultimo = soma;
//            }
//            i++;
//        } while (i < 15);
    }
}