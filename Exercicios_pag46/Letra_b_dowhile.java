/* Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). */

// para o do-while
void main() {
    int soma=0;
    int numero=0;

    do {
        soma = soma + numero;
        numero++;
    } while(numero<=100);
    IO.println("A soma dos 100 primeiros número é:"+ soma);

}