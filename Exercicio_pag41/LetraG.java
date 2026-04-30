/*Efetuar a leitura de quatro números inteiros e 
apresentar os números que são divisíveis por 2 e 3. */

void main () {
    int A = Integer.parseInt(IO.readln("Insira um valor para A: "));
    int B = Integer.parseInt(IO.readln("Insira um valor para B: "));
    int C = Integer.parseInt(IO.readln("Insira um valor para C: "));
    int D = Integer.parseInt(IO.readln("Insira um valor para D: "));

    if ((A%2==0) && (A%3==0))
        IO.println(A + " é divisivel por 2 e 3");

    if ((B%2==0) && (B%3==0))
        IO.println(B + " é divisivel por 2 e 3");

    if ((C%2==0) && (C%3==0))
        IO.println(C + " é divisivel por 2 e 3");

    if ((D%6==0))
        IO.println(D + " é divisivel por 2 e 3");
    
}