//Escrever um programa em java para calcular o consumo médio de um automóvel sendo
//fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.


import java.io.PrintStream;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;


public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, UTF_8);

        out.println("Informe a distância percorrida:");
        float distancia = scanner.nextFloat();
        out.println("Informe o combustível gasto: ");
        float combustivel = scanner.nextFloat();

        float media = distancia / combustivel;

        out.println("O consumo médio gasto é de:" + media);
    }
}

//1- O usuário vai informar a distância percorrida pelo automóvel e o combustível gasto.
//2-Calculo do consumo médio
//3-mMostrar na tela o gasto.