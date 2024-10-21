
import java.util.Scanner;

public class atv3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada do valor da compra e do desconto em percentual
        System.out.print("Informe o valor cheio da compra: ");
        double valorCheio = sc.nextDouble();
        System.out.print("Informe o valor do desconto (em %): ");
        double desconto = sc.nextDouble();
        
        // Calcula o valor do desconto em dinheiro
        double valorDesconto = valorCheio * (desconto / 100);
        
        // Calcula o novo valor da compra após aplicar o desconto
        double valorFinal = valorCheio - valorDesconto;
        
        // Exibe o valor cheio, o valor do desconto e o novo valor após o desconto
        System.out.println("O valor cheio é: " + valorCheio);
        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O novo valor é: " + valorFinal);
        
        sc.close(); // Fecha o scanner
    }
}
