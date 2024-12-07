import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do responsavel da conta !");
        String nomeCliente = scanner.next();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Agencia: " + agencia );
        System.out.println("Conta " + numero );

    }
}
