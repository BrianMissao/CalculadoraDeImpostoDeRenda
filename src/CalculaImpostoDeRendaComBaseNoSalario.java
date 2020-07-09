import java.util.Scanner;

public class CalculaImpostoDeRendaComBaseNoSalario {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salario = obterSalario();
        calcularEImprimirImposto(salario);
    }

    private static void calcularEImprimirImposto(double salario) {
        double valorAPagar = 0.0;
        double diferenca = 0.0;
        if (salario > 4500.00) {
            diferenca = salario - 4500;
            salario -= diferenca;
            valorAPagar += diferenca * 28 / 100;
        }
        if (salario > 3000 && salario <= 4500) {
            diferenca = salario - 3000;
            salario -= diferenca;
            valorAPagar += diferenca * 18 / 100;
        }
        if (salario > 2000 && salario <= 3000) {
            diferenca = salario - 2000;
            salario -= diferenca;
            valorAPagar += diferenca * 8 / 100;
        }
        if (valorAPagar == 0) {
            System.out.printf("Isento de pagamento");
            return;
        }
        System.out.printf("Valor a pagar: R$%.2f", valorAPagar);
    }

    private static double obterSalario() {
        System.out.println("Digite seu salário:");
        return scanner.nextDouble();
    }
}
