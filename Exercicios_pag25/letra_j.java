/* j) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
      dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
      disponível com o usuário, para que seja apresentado o valor em moeda brasileira. */

void main(){

    float valorDolar = Float.parseFloat(IO.readln("Informe a cotação do dólar hoje: "));
    float quantidade = Float.parseFloat(IO.readln("E quantos dólares você tem, americana? "));

    IO.println("Então você está ryca! Tem R$" + valorDolar*quantidade);
}      