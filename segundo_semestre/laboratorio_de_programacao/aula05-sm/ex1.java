//1 - Crie uma classe que simule a jogada de um dado de seis lados (números
// de 1 a 6) por três vezes. Ao final some seus valores e apresente o resultado
// das três jogadas.

import java.awt.*;

public class ex1 {
    public static void main(String[] args) {

        int randomNum1 = (int)(Math.random() * 7);
        System.out.println(randomNum1);

        int randomNum2 = (int)(Math.random() * 7);
        System.out.println(randomNum2);

        int randomNum3 = (int)(Math.random() * 7);
        System.out.println(randomNum3);

        int soma = randomNum1 + randomNum2 + randomNum3;
        System.out.println("A soma e:" + soma);

    }
}