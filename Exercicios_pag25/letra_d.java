/* d) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
      automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
      (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a
      distância percorrida com a fórmula DISTANCIA ← TEMPO * VELOCIDADE. Possuindo o valor da
      distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
      LITROS_USADOS ← DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
      média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
      quantidade de litros (LITROS_USADOS) utilizada na viagem. */

void main(){

    float tempo = Float.parseFloat(IO.readln("Informe o tempo de viagem: "));
    float velocidade = Float.parseFloat(IO.readln("Informe a velocidade média: "));

    float distanciaPercorrida = tempo * velocidade;
    float litrosUsados = distanciaPercorrida / 12;

    IO.println("Tempo de viagem: " + tempo + "h");
    IO.println("Velocidade média: " + velocidade + "km/h");
    IO.println("Distância percorrida: " + distanciaPercorrida + "km");
    IO.println("Litros de combustível gastos: " + litrosUsados + "litros");

}