/* Exemplo: Desvio condicional composto
Fazer um programa que leia 3 notas, calcule a média aritmética e informe: aprovado 
caso a média seja maior ou igual a 7,0; reprovado se a média encontrada for menor que 7,0. */

void main(){

    float nota1 = Integer.parseInt(IO.readln("Informe a nota da 1a unidade: "));
    float nota2 = Integer.parseInt(IO.readln("Informe a nota da 2a unidade: "));
    float nota3 = Integer.parseInt(IO.readln("Informe a nota da 3a unidade: "));

    float media = (nota1 + nota2 + nota3 ) / 3;

    if (media>=7)
        System.out.printf("Aprovado com média %.2f \n", media);
    else
        System.out.printf("Reprovado com média %.2f \n", media);
}