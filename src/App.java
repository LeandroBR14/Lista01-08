public class App {
    public static void main(String[] args) {
        double salariohora;
        double horasmes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        salariohora = teclado.nextDouble();

        System.out.println("Qual a quantidade de horas trabalhadas nesse mês?");
        horasmes = teclado2.nextDouble();

        double salariomensal = salariohora * horasmes;
        System.out.println("O seu salário nesse mês é: " +salariomensal);
        teclado.close();
    }
}