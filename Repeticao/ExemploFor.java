void main() {

    IO.println("=== Simulador de Investimento===");

    double depositoMensal =Double.parseDouble(IO.readln("valor do depósito mensal: "));
    double taxaJuros = Double.parseDouble(IO.readln("Taxa de juros mensal (em %): "))/100;
    int tempoMeses= Integer.parseInt(IO.readln("Quantidade de meses: "));

    double saldoTotal = 0;

    //Estrutura de repetição For
    for(int mes =1; mes<=tempoMeses; mes++){
        //Lógica: Adiciona o depósito e aplica os juros sobre o saldo acumulado
        saldoTotal= (saldoTotal + depositoMensal)* (1 + taxaJuros);

        //Exibindo a evolução mês a mês
        System.out.printf("Mês %d | Saldo acumulado: R$ %.2f%n",mes, saldoTotal);

    }

    IO.println("-----------------------");

    System.out.printf("Resultado final após %d meses: R$ %.2f%n", tempoMeses, saldoTotal);
}