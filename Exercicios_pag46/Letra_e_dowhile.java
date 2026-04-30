/* Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. 
Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. 
Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^). */

void main(){
    int numreo=3;
    int expoente= 0;

    do {
        double resultado= Math.pow(3,expoente);
       // System.out.printf("3 elevado a %d = %.1f \n", expoente, resultado);
        IO.println(numreo + " elevado a " + expoente + " = " + resultado);
        expoente++;
    } while(expoente<=15);

}