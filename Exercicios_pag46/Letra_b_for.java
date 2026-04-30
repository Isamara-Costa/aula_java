/* Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). */

void main() {
    int soma=0;

    for(int numero=0; numero<=100; numero++){
        soma = soma + numero;
    }
    IO.println("A smoa dos 100 primeiros número é:"+ soma);

}