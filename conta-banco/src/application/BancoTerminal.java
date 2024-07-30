import java.math.BigDecimal;
import java.util.Scanner;

public class BancoTerminal {
        
    
   public static void main(String[] args) {
    Integer numero;
    String agencia;
    String nomeCliente;
    BigDecimal saldo;
    
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Por favor, digite o seu nome completo");
    nomeCliente = sc.nextLine();
    
    System.out.println("Por favor, digite o número da agência");
    agencia = sc.nextLine();

    System.out.println("Por favor, digite o número da conta");
    numero = sc.nextInt();
    
    System.out.println("Por favor, digite o saldo inicial da conta");
    saldo = sc.nextBigDecimal();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua" 
                      + " agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo 
                      +  " já está disponível para saque.");
    sc.close();

   }

}