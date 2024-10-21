
import java.util.Scanner;

public class atv5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada da nota
        System.out.print("Digite a nota (0 a 100): ");
        int nota = sc.nextInt(); // Recebe a nota digitada pelo usuário
        
        // Verifica o conceito baseado na nota
        if (nota > 90) {
            System.out.println("Conceito A");
        } else if (nota > 80) {
            System.out.println("Conceito B");
        } else if (nota > 70) {
            System.out.println("Conceito C");
        } else if (nota > 60) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
        
        sc.close(); // Fecha o scanner
    }
}
