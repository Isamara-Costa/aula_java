/* a) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e
      D). Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro
      valor, e o resultado da soma (variável S) do segundo com o quarto valor. */

void main(){

    int A = Integer.parseInt(IO.readln("A: "));
    int B = Integer.parseInt(IO.readln("B: "));
    int C = Integer.parseInt(IO.readln("C: "));
    int D = Integer.parseInt(IO.readln("D: "));

    int P = A * C;
    int S = B + D;

    IO.println("Produto do primeiro com o terceiro valor: " + P);
    IO.println("Soma do segundo com o quarto valor: " + S);
}