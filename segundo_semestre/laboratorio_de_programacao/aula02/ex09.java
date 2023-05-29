//A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
//prestações sem juros. Faça um programa que receba um valor de uma compra
//e mostre o valor das prestações

import java.io.PrintStream;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, UTF_8);

        out.println("Qual é o valor da compra?:");
        float compra= scanner.nextFloat();
        out.println("O valor das parcelas ficaram de:" + (compra / 5));
    }
}
