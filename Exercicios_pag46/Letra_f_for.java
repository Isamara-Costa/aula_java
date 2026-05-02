/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base
qualquer elevada a um expoente qualquer, ou seja, de B elevado a E, em que B é o valor da base 
e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
portuguol (^). */

void main(){
    int numero = Integer.parseInt(IO.readln("Insira o número da base: "));
    int expoente = Integer.parseInt(IO.readln("Insira o número do expoente: "));
    int contorle =1;

    //do {
      //  IO.println(numero + " elevado a "+ expoente + " = " + (Math.pow(numero,expoente)));
   // } while(contorle<=expoente);

    IO.println(numero + " elevado a "+ expoente + " = " + (Math.pow(numero,expoente)));
} 