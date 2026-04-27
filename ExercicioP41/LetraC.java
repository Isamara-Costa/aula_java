/*  Ler quatro valores referentes a quatro notas escolares de um aluno e 
imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5.
Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
Apresentar junto das mensagens o valor da média do aluno para qualquer condição.*/

void main() {

    float nota1 = Float.parseFloat(IO.readln(" Insira a Nota 1: "));
    float nota2 = Float.parseFloat(IO.readln(" Insira a Nota 2: "));
    float nota3 = Float.parseFloat(IO.readln(" Insira a Nota 3: "));
    float nota4 = Float.parseFloat(IO.readln(" Insira a Nota 4: "));

    float media = (nota1 + nota2 + nota3 + nota4)/4;

    if (media>=5)
        IO.println("O aluno foi aprovado com média:" + media);
    else
        IO.println(" o aluno foi reprovado com média: "+ media);

}