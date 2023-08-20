import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
      
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
            System.out.println("Por favor digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Por favor informe sua agencia: ");
            int agencia = scanner.nextInt();

            System.out.println("Por favor digite o numero da sua conta: ");
            int numero = scanner.nextInt();

            System.out.println("Por favor informe seu deposito para liberar saldo em conta: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$: "+saldo+" já está disponível para saque.");
        }finally {
            scanner.close();
        }
}
}
