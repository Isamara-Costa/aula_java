/*Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores. */

void main() {
    
    int A = Integer.parseInt(IO.readln("Insira um valor para A: "));
    int B = Integer.parseInt(IO.readln("Insira um valor para B: "));
    int C = Integer.parseInt(IO.readln("Insira um valor para C: "));
    int D = Integer.parseInt(IO.readln("Insira um valor para D: "));
    int E = Integer.parseInt(IO.readln("Insira um valor para E: "));
    int maior = A;
    int menor = A;

    if (B>maior) 
        maior = B;
    if (B<menor)
        menor=B;
     if (C>maior) 
        maior = C;
    if (C<menor)
        menor=C;
     if (D>maior) 
        maior = D;
    if (D<menor)
        menor=D;
     if (E>maior) 
        maior = E;
    if (E<menor)
        menor=E;
         IO.println(" o maior número é:  " + maior + " e o menor numero é:"+ menor);
    

}