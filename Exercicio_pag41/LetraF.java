/* Efetuar a leitura de três valores (variáveis A, B e C) 
e apresentá-los dispostos em ordem crescente. */

import java.lang.classfile.instruction.SwitchCase;

void main () {
    int aux;
    int A = Integer.parseInt(IO.readln("Insira o valor de A: "));
    int B = Integer.parseInt(IO.readln("Insira o valor de B: "));
    int C = Integer.parseInt(IO.readln("Insira o valor de C: "));

    if (A>B) {
        aux=A;
        A=B;
        B=aux;
    }
    if (A > C) {
        aux=A;
        A = C;
        C =aux;
    }
    if (B>C) {
        aux =B;
        B=C;
        C = aux;
    }

    IO.println("Em ordem crescente temos "+ A + ", "+ B + ", " + C);

}