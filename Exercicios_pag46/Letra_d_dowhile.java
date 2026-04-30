/* Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. 
Para verificar se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição 
com a instrução se, perguntando se o número é ímpar; sendo, mostre-o; 
não sendo, passe para o próximo passo. */

void main(){

    int numero = 0;
    do {

        if(numero%2==1)
            IO.println(numero + " é ímpar");

        numero ++;
        
    } while(numero<=20);
}