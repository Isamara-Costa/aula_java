/* Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
pares situados na faixa numérica de 50 a 70. */

void main() {

    int contador;
    int soma =0, par =0;

    for(contador=50; contador<=70; contador++) {
        if (contador %2==0){
            soma=soma + contador;
            par++;
        }

    }
    float media= soma/par;

    IO.println("A soma dos valores é : "+ soma );
    IO.println("A média dos valores é : "+ media );

}