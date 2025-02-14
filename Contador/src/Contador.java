import java.util.Scanner;

@SuppressWarnings("unused")
public class Contador {
	public static void main(String[] args) {
            int parametroUm= 34;
            int parametroDois = 92;

		try {
            contar (parametroUm, parametroDois);
              } catch (Exception e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");               }
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			
			} catch (Exception e) {
			   //capturar a exceção e imprimir a mensagem
								
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
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