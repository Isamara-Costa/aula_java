/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
somatório e a média aritmética dos valores lidos. */

void main() {
    int soma=0;

    for(int contador =1; contador <=10; contador++) {
        int valor= Integer.parseInt(IO.readln("Informe um número: "));
        soma=soma + valor;
        IO.println(soma);
    }
    float media = soma/10;
    IO.println("A soma dos 10 valores é : "+ soma + " E a média é: " + media );
}