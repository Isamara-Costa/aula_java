/* b) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do
      percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS). */

      
void main() {

    float SM = Float.parseFloat(IO.readln("Informe o seu salário: "));
    float PR = Float.parseFloat(IO.readln("Informe o percentual de aumento: "));

    float NS = SM * (1 + PR/100);

    IO.println("O salário de " + SM + " com " + PR + "% de aumento é:" + NS);
    

}      