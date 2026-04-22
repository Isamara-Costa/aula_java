/* Exemplo: desvio condicional simples 
   fazer um programa que leia um ano qualquer e informe se o mesmo é bissexto. */


void main(){

    int year = Integer.parseInt(IO.readln("Informe 1 ano: "));

    if(year % 4 == 0)
        IO.println(year + " é bissexto");
}