// b) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
//    conversão é C ← (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

    void main() {

        float fahrenheit = Float.parseFloat(IO.readln("Informe uma temperatura em graus Fahrenheit: "));

        float celsius = (fahrenheit - 32) * ((float)5/9);

        IO.println(fahrenheit + "oF equivalem a " + celsius + "oC");
    }