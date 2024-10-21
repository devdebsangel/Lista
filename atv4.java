
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5]; // Array para armazenar as notas dos alunos
        double soma = 0, maiorNota = 0, menorNota = 10;
        
        // Coleta as notas de 5 alunos
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i]; // Acumula as notas para cálculo da média
            
            // Verifica se é a maior nota
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            
            // Verifica se é a menor nota
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
        }
        
        // Calcula a média das notas
        double media = soma / 5;
        
        // Exibe a maior nota, menor nota e a média da turma
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média da turma é: " + media);
        
        sc.close(); // Fecha o scanner
    }
}