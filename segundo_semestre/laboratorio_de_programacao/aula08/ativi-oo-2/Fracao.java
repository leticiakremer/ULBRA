public class Fracao {

    //numerador daa fraçao
    double numerador;

    //Denominador da fração
    double denominador;

    //Calcular o valor da fração
    public double calcularValor(){
        /*
        Para calcular o valor, basta dividir o numerador da fraçnao pelo denominador.
        Se o denominador for 0, o resultado é assumido como 0, já que não é possível fazer divisão por 0;
         */
        if(denominador == 0 ){
            return 0;
        }
        return numerador / denominador;
    }

    /*
    Multiplicar a fraçnao atuala ( do primeira objeto) por outro (passada como parametro)
    dando uma terceira fração como resultado
     */
    public Fracao multiplicar(Fracao f){
        //Criar um novo resultado
        Fracao result = new Fracao();

        //Multiplicar os numeradores e denominadores das frações
        result.numerador = this.numerador * f.numerador;
        result.denominador = this.denominador * f.denominador;
        return result;
    }

    //Defina os valores do numerador e denominador da fração
    public void definirValores(double numerador, double denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //Retornar a representação da fração em forma de String
    public String obterFracao(){
        return numerador + "/" + denominador;
    }

}
