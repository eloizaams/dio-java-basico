package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {


	public static void main(String[] args) {
		new Contador().contador();
	}

	private void contador() {
		Scanner sc = new Scanner (System.in);	
		
		try {
			System.out.println("Digite o primeiro número inteiro");
			int primeiroNumero = sc.nextInt();
			
			System.out.println("Digite o segundo número inteiro");
			int segundoNumero = sc.nextInt();
			contar(primeiroNumero, segundoNumero);
		}
		catch(InputMismatchException e) {
			System.out.println("ERRO: Parâmetro incorreto! \nO parâmetro a ser digitado deve ser um número inteiro.");
		}
		catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

	
	public void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
		if(primeiroNumero > segundoNumero) {
			throw new ParametrosInvalidosException("O segundo número deve ser maior do que o primeiro.");
		}
		else {
			for(int i = 1; i <= (segundoNumero - primeiroNumero); i++) {
				System.out.println("Imprimindo o nº " + i);
			}
		}
	}
}