/* h) Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
      VOLUME ← COMPRIMENTO * LARGURA * ALTURA.*/

void main(){

    IO.println("Os dados devem ser fornecidos em centímetros");
    float comprimento = Float.parseFloat(IO.readln("Informe o comprimeiro da caixa: "));
    float largura = Float.parseFloat(IO.readln("Informe a largura da caixa: "));
    float altura = Float.parseFloat(IO.readln("E a altura, bebê?: "));

    double volume = comprimento * largura * altura;

    IO.println("O volume da caixa é " + volume + "cm2.");
}      