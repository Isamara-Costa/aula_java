/* e)Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
     PRESTACAO ← VALOR + ((VALOR * TAXA/100) * TEMPO). */

void main(){

    float valorPrestacao = Float.parseFloat(IO.readln("Informe o valor da prestação: "));
    float taxa = Float.parseFloat(IO.readln("Informe a taxa (a.m): "));
    int tempo = Integer.parseInt(IO.readln("Informe o número de meses em atraso: "));

    float prestacao = valorPrestacao + ( (valorPrestacao * taxa/100) * tempo);

    IO.println("O valor da prestação para pagamento hoje é de R$" + prestacao);
}     