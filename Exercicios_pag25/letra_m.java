/* m) Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
      quadrado da soma dos três valores lidos. */

void main(){

    int a = Integer.parseInt(IO.readln("Informe um número: "));
    int b = Integer.parseInt(IO.readln("Informe um número: "));
    int c = Integer.parseInt(IO.readln("Informe um número: "));

    IO.println("O quadrado da soma dos três valores lidos é: " + Math.pow((a+b+c),2) );

}            