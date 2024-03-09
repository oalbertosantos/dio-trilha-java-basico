//TODO: conhecer e importar a classe scanner;

import java.util.Scanner;
import java.util.Locale; //Desse modo, é possivel configurar o local padrão da configuração de números.

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Assim, o ponto é usado como separador decimal.

        Scanner scanner = new Scanner(System.in);
        
//TODO: exibir as mensagens para o usuário e obter os valores digitados no terminal;

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

//TODO: exibir a mensagem final.

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é: " + agencia + ", conta: " + numero + ", e seu saldo R$ " + saldo + " já está disponivel para saque.");

        scanner.close();
        
    }
}
