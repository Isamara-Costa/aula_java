/* Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). */

void main() {
    int soma=0;
    int numero=0;

    while(numero<=100){
        soma = soma + numero;
        numero++;
    }
    IO.println("A smoa dos 100 primeiros número é:"+ soma);

}