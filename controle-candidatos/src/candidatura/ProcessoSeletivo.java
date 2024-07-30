package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		analisarCandidato(valorPretendido());
		selecaoCandidatos();
	}
	
	public static void imprimirCandidatos() {
		
	}
	
	public static void selecaoCandidatos() {
		String[] candidatos = {"MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "PEDRO", "JOÃO", "JOAQUIM"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual++];
			double salarioPretendido = valorPretendido();
			System.out.printf("\n\nO candidato %s solicitou R$ %,.2f", candidato, salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.printf(" e foi selecionado para a vaga." );
				candidatosSelecionados++; 
			}
		}
	}
	
	public static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	public static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		System.out.println("O valor pretendido é " + salarioPretendido);
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else{
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
