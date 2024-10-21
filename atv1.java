
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada da palavra
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine(); // Recebe a palavra digitada pelo usuário
        
        // Exibe a palavra digitada
        System.out.println("A palavra digitada foi: " + palavra);
        
        // Exibe o número de caracteres
        System.out.println("A palavra tem " + palavra.length() + " dígitos");
        
        // Exibe a primeira letra
        System.out.println("A primeira letra é: " + palavra.charAt(0));
        
        // Calcula a letra central e exibe
        int meio = palavra.length() / 2;
        System.out.println("A letra central é: " + palavra.charAt(meio));
        
        // Exibe a última letra
        System.out.println("A última letra é: " + palavra.charAt(palavra.length() - 1));
        
        // Exibe a palavra ao contrário
        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println("A palavra escrita ao contrário é: " + invertida);
        
        // Exibe a palavra toda em maiúsculas
        System.out.println("A palavra toda em maiúsculo: " + palavra.toUpperCase());
        
        // Exibe a palavra toda em minúsculas
        System.out.println("A palavra toda em minúsculo: " + palavra.toLowerCase());
        
        sc.close(); // Fecha o scanner
    }
}








