//4-a) Ler dois valores numéricos inteiros e apresentar 
// o resultado da diferença do maior pelo menor valor.

void main(){

    float a = Float.parseFloat(IO.readln("Informe o primeiro número A: "));
    float b = Float.parseFloat(IO.readln("Informe o segundo número B: "));

    float resultado;

     if (a>=b) {
       resultado =a-b;
       IO.println("A difereça de A-B é: " + resultado); 
    } else {
        resultado = b-a;
        IO.println("A diferença de B-A é: " + resultado);
    }
}
