//Crie uma classe chamada Senha que contenha um método chamado
//gerar que retorna uma senha contendo oito caracteres numéricos. Faça
//também outra classe para testar o método.

import java.util.Random;

public class GeradorSenha {
    public String gerar(){

        StringBuilder builder = new StringBuilder();
        Random randon = new Random();

        int num = 0;
        for(int i=0; i<8; i++){
            num = randon.nextInt(9);

            builder.append(num);
        }
        return builder.toString();
    }

}
