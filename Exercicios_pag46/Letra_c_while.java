/*Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
1 até 500. */

void main(){
    int numero= 0;
    int soma= 0;

    while(numero<=500){
        soma=soma + numero;
        numero = numero +2;
        //IO.println("a soma é "+soma);
    }
    IO.println("-----------------------");
    IO.println("A soma dos número pares de 1 a 500 é: "+ soma);
}