//1 - Um aluno tirou notas 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente.
//Escreva um programa que imprima a média do aluno.

public class ex01 {
    public static void main(String[] args) {
        float nota1 = 8.5f;
        float nota2 = 7.5f;
        float nota3 = 6.0f;
        int peso1 = 3;
        int peso2 = 2;
        int peso3 = 5;
        float resultado = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        System.out.println("A média é:" + resultado);
    }
}
//Declarar as váriaveis das notas e peso.
// Cálculo das notas
// Mostrar na tela!