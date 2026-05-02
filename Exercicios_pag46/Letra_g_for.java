/*Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de
Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza
pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo
valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo
é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc. */

void main(){

    int atual=1;
    int anterior=0;
    int proximo;
    int guarda;

    for(int controle=1; controle<=15; controle++){
        proximo = atual + anterior;
        guarda=atual;
        IO.println(atual);
        atual = proximo;
        anterior=guarda;
        
    }
}