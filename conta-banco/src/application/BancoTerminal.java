package application;
import java.util.Scanner;

import entities.ContaBancaria;

public class BancoTerminal {
        
    
   public static void main(String[] args) throws Exception{
	    try {
	    	new BancoTerminal().bancoTerminal();
	    }catch(Exception e) {
	    	System.out.println("Valor inválido digitado");
	    }
    }
   
   private void bancoTerminal() {
	
	ContaBancaria cb = new ContaBancaria();
   
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Por favor, digite o seu nome completo");
    cb.setNomeCliente(sc.nextLine());
    
    System.out.println("Por favor, digite o número da agência");
    cb.setAgencia(sc.nextLine());

    System.out.println("Por favor, digite o número da conta");
    cb.setNumero(sc.nextInt());
    
    System.out.println("Por favor, digite o saldo inicial da conta");
    cb.setSaldo(sc.nextBigDecimal());

    System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %04d e seu saldo %,.2f"
    		+ " já está disponível para saque.", cb.getNomeCliente(), cb.getAgencia(), cb.getNumero(), cb.getSaldo()));
    sc.close();

   }

}