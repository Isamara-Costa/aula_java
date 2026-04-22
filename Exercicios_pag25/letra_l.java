/* l) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final a
      soma dos quadrados dos três valores lidos. */

void main(){

    int a = Integer.parseInt(IO.readln("Informe um número: "));
    int b = Integer.parseInt(IO.readln("Informe um número: "));
    int c = Integer.parseInt(IO.readln("Informe um número: "));

    IO.println("A soma dos quadrados dos três valores lidos é: " + ( a*a + b*b + c*c ) );

}      