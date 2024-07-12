 import java.util.Scanner;

 public class VolumeCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado do cube; por favor: ");
        double lado = scanner.nextDouble();
        double volume = Math.pow(lado, 3);
        if (lado<= 0){
            System.out.println(" Não é possivel calcular");
        }
        else{
            System.out.println("O volume do cubo é:" + volume);
        }
        scanner.close(); 
 
    }

 }
 
