/* Exemplo: Desvio condicional composto
Fazer um programa que leia 3 notas, calcule a média aritmética e informe: aprovado 
caso a média seja maior ou igual a 7,0; reprovado se a média encontrada for menor que 7,0. */

void main(){

    float nota1 = Float.parseFloat(IO.readln("Informe a nota da 1a unidade: "));
    float nota2 = Float.parseFloat(IO.readln("Informe a nota da 2a unidade: "));
    float nota3 = Float.parseFloat(IO.readln("Informe a nota da 3a unidade: "));

    float media = (nota1 + nota2 + nota3 ) / 3;

    if (media>=7)
        IO.println("Aprovado com média: " + media);
    else
        System.out.printf("Reprovado com média: %.2f \n", media);
}