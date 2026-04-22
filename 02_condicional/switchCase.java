void main(){

    int numero1 = Integer.parseInt(IO.readln("Informe um número: "));
    int numero2 = Integer.parseInt(IO.readln("Agora outro número: "));
    IO.println("Menu");
    IO.println("1 - Soma os números digitados");
    IO.println("2 - subtrai os números digitados");
    int operacao = Integer.parseInt(IO.readln("Qual a sua escolha? "));

    switch (operacao){
        case 1:
            IO.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
            break;
        case 2:
            IO.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
            break;
        default:
            IO.println("operação inválida");
    }

}