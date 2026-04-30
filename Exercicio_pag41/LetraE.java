/*Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo 
da equação completa de segundo grau, apresentando as duas raízes, 
se para os valores informados for possível efetuar o referido cálculo. 
Lembre-se de que a variável A deve ser diferente de zero. */

void main() {

    float A = Float.parseFloat(IO.readln("Insira o valor da variável A:" ));
    float B = Float.parseFloat(IO.readln("Insira o valor da variável B: "));
    float C = Float.parseFloat(IO.readln("Insira o valor da variável C: "));

    if (A != 0) 
        {
        double delta = Math.pow(B, 2) - 4 * A * C ;

        if(delta>=0)
        {
            double X1= (-B + Math.sqrt(delta))/ (2*A);
            double X2= (-B - Math.sqrt(delta))/ (2*A);
            System.out.printf("As raizes da equção são: X1= %.2f e X2= %.2f \n", X1, X2);
        }
        else 
            System.out.printf("O valor de Delta %.2f é negativo, portanto não possuem raizes reais \n", delta);
         }
    
    else
        IO.println("O valor de A deve ser diferente de zero para que a equação seja de segundo grau");


}