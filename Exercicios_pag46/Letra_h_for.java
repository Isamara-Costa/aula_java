/*Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
programa deve apresentar os valores das duas temperaturas. A fórmula de conversão
é F=(9*C+60)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */

void main() {
    

    for(int Celsius=10; Celsius<=100; Celsius=Celsius+10){
        float Fahrenheit= (9*Celsius +60)/5;
        IO.println("a temperatura "+ Celsius+ "°C " + " = "+ Fahrenheit + "°F");
    }

}