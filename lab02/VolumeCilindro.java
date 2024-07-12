import java.util.Scanner;

 public class VolumeCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        double raio = scanner.nextDouble();
        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();
        double raioexponencial = Math.pow(raio, 3);
        double volume = 3.14 * raioexponencial *altura;
        System.out.println("O volume do cubo é:" + volume);
        
        scanner.close(); 
 
    }

 }