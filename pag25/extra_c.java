/* c) Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a
    apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para
    cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de
    votos válidos para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e
    votos em branco. Ao final o programa deve apresentar o número total de eleitores, considerando votos
    válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de
    eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de
    eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de
    eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade de
    eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e por último
    o percentual correspondente de votos em branco em relação à quantidade de eleitores. */

void main(){

    int votosA = Integer.parseInt(IO.readln("Votos no candidato A: "));
    int votosB = Integer.parseInt(IO.readln("Votos no candidato B: "));
    int votosC = Integer.parseInt(IO.readln("Votos no candidato C: "));
    int votosBrancos = Integer.parseInt(IO.readln("Votos em branco: "));
    int votosNulos = Integer.parseInt(IO.readln("Votos nulos: "));
    float totalEleitores = votosA+votosB+votosC+votosBrancos+votosNulos;

    IO.println("percentual correspondente de votos válidos: " + ((votosA+votosB+votosC)/totalEleitores*100) + "%");
    IO.println("percentual correspondente de votos candidato A: " + (votosA/totalEleitores*100) + "%");
    IO.println("percentual correspondente de votos candidato B: " + (votosB/totalEleitores*100) + "%");
    IO.println("percentual correspondente de votos candidato C: " + (votosC/totalEleitores*100) + "%");
    IO.println("percentual correspondente de votos nulos: " + (votosNulos/totalEleitores*100) + "%");
    IO.println("percentual correspondente de votos em branco: " + (votosBrancos/totalEleitores*100) + "%");
}    