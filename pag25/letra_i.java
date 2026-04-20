// i)Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.

void main(){

    int num1 = Integer.parseInt(IO.readln("Informe um número: "));
    int num2 = Integer.parseInt(IO.readln("Informe um número: "));

    IO.println("O quadrado da diferença do primeiro valor digitado pelo segundo valor digitado é: " + Math.pow((num1-num2),2));

}