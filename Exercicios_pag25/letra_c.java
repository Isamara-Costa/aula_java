// c) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume ← π * Raio^2 * Altura

void main(){

    float raio = Float.parseFloat(IO.readln("Informe o raio da lata (em cm): "));
    float altura = Float.parseFloat(IO.readln("E a altura (em cm), bebê?: )"));

    double volume = 3.14 * Math.pow(raio,2) * altura;

    IO.println("O volume da lata é " + volume + "cm3.");
}