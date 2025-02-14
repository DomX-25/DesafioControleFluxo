import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt(7);
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt(35);
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			
			} catch (Exception e) {
			   //capturar a exceção e imprimir a mensagem
								
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			}
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws Exception {
		if (parametroUm >= parametroDois) {
			throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + (parametroUm + i));
		}
	}
}