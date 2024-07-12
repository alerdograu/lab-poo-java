package lab02;
import java.util.Scanner;

public class Tabela{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga sua nota:");
        double nota = scanner.nextDouble();

        if (nota >= 90 && nota <= 100) {
         System.out.print("Conceito A");  
        }
        else if (nota >= 80 && nota <= 90) {
         System.out.print("Conceito B");
        }
        else if (nota >= 70 && nota <= 80) {
         System.out.print("Conceito C");
        }
        else if (nota >= 60 && nota <= 70) {
         System.out.print("Conceito D");
        }
        else{
         System.out.print("Conceito E");
        }

        scanner.close();

    } 
    
}    

// questâo de analise de conceitos 

