package br.com.erickfreire.multiplosde2comloopinfinito;

/**
 * Program em Java que mostra o multiplo de 2 com loop infinito
 * @author Erick Freire
 * @version 1 - Criado em 11-04-2021 as 19:29
 */

public class Multiplosde2ComLoopInfinito {
	public static void main(String[] args) {
		int numero = 1;
		
		while(numero > 0) {
			numero *= 2;
			
			System.out.printf("Numero: %d%n", numero);
		}
	}

}
