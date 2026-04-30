/*Para testar o laço "for" faça um programa que calcule a taboada
de multiplicação de um número qualquer. */


void main() {

    int numero = Integer.parseInt(IO.readln("Insira um número: "));

    for (int multiplicador =1; multiplicador<=10; multiplicador++)
        IO.println( numero + " x " + multiplicador + " = " + (numero*multiplicador));

    //o termo multiplicador++ serve para o programa acresecentar um a cada repetição
}