
import java.util.Scanner;

public class ParametrosFluxo {
    public void executar() {
        try {
            // Código que pode lançar exceção
        } catch (Exception e) {
            // Tratamento da exceção
        } finally {
            // Fechamento de recursos
        }
        System.out.println("Digite o primeiro parâmetro:");
        try (Scanner scanner = new Scanner(System.in)) {
            int primeiroParametro = scanner.nextInt(12);
            System.out.println("Digite o segundo parâmetro:");
            int segundoParametro = scanner.nextInt(24);
            for (int i = primeiroParametro; i <= segundoParametro; i++) {
                System.out.println("Contagem: " + i);
            }
        }
    }
}
