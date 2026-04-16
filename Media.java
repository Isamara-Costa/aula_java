void main() {
    
    float nota1 = Float.parseFloat(IO.readln("Informe a 1a nota: "));
    float nota2 = Float.parseFloat(IO.readln("Informe a 2a nota: "));
    float nota3 = Float.parseFloat(IO.readln("Informe a 3a nota: "));

    float medias = (nota1 + nota2 + nota3) / 3;

    IO.println("A média é: " + medias);
}