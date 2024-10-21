
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada do número
        System.out.print("Digite um número: ");
        int numero = sc.nextInt(); // Recebe o número digitado pelo usuário
        
        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        
        // Verifica se o número é positivo ou negativo
        if (numero >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
        
        // Verifica se o número é primo
        boolean primo = true;
        if (numero < 2) {
            primo = false; // Números menores que 2 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        System.out.println("O número é primo: " + (primo ? "sim" : "não"));
        
        // Calcula e exibe a raiz quadrada do número
        System.out.println("A raiz quadrada do número: " + Math.sqrt(numero));
        
        // Calcula e exibe o número elevado ao cubo
        System.out.println("O número elevado ao cubo é: " + Math.pow(numero, 3));
        
        sc.close(); // Fecha o scanner
    }
}
