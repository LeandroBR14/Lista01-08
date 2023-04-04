import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double salariohora = teclado.nextDouble();

        System.out.println("Qual a quantidade de horas trabalhadas nesse mês?");
        double horasmes = teclado.nextDouble();

        double salariomensal = salariohora * horasmes;
        System.out.printf("O seu salário nesse mês é: %.2f", salariomensal);
        teclado.close();
    }
}