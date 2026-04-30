//Efetuar a leitura de um valor inteiro positivo ou negativo 
// e apresentar o número lido como sendo um valor positivo, 
// ou seja, o programa deverá apresentar o módulo de um número fornecido. 
// Lembre-se de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.

void main() {

    int Num1 = Integer.parseInt(IO.readln("Insira um número: "));

    if (Num1<1) {
       Num1 =  Num1 * (-1);
       IO.println(" O número é: " + Num1);
    } else {
       IO.println(" O número é: " + Num1); 
    }
}