import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosFluxo exception) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			}
		}
	}
	
	static class ParametrosFluxo extends Exception {
		public ParametrosFluxo() {
			super("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosFluxo {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
            throw new ParametrosFluxo();
		}
		
		int contagem = parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = contagem; i <= parametroDois; i++) {
			System.out.println("Número: " + i);
		}
	}
}