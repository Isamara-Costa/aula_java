/*Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da
média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média.
Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta
condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição. */

void main(){

    float nota1 = Float.parseFloat(IO.readln(" Insira a Nota 1: "));
    float nota2 = Float.parseFloat(IO.readln(" Insira a Nota 2: "));
    float nota3 = Float.parseFloat(IO.readln(" Insira a Nota 3: "));
    float nota4 = Float.parseFloat(IO.readln(" Insira a Nota 4: "));

    float media = (nota1 + nota2 + nota3 + nota4)/4;

    if (media>=7)
        IO.println("O aluno foi aprovado");
    else {
        float nota5 = Float.parseFloat(IO.readln("insira a nota do exame: "));
        float exame = (media + nota5)/2;
         if (exame>=5)
            IO.println("O Aluno aprovado em prova final com média: " + exame);
        else
            IO.println("O Aluno foi reprovado com média: " + exame);
    }
}