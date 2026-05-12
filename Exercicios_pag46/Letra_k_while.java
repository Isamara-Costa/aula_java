/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
total acumulado da área residencial. */

void main() {

    String continua= "s", comodo;
    float largura, comprimento, areaTotal=0;

    while(continua.equalsIgnoreCase("s")) {
        comodo= IO.readln("Informe o nome do comôdo: ");
        largura= Float.parseFloat(IO.readln("Informe a largura do "+ comodo + ": "));
        comprimento= Float.parseFloat(IO.readln("Informe o comprimento do "+ comodo + ": "));
        areaTotal= areaTotal+ largura*comprimento;
        continua=IO.readln("Deseja continuar (s/n)? ");
    }

    IO.println(" a area total da residência é de "+ areaTotal + "m2");
}