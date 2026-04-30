void main() {

    int numero = Integer.parseInt(IO.readln("Insira um número: "));
    int multiplicador= 1;

    while(multiplicador<=10) {
        System.out.printf(" %d x %d = %d \n ", numero, multiplicador, numero*multiplicador);
        multiplicador++;
    }
}