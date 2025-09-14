import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  =  new Scanner(System.in);

        System.out.println("Ingrese el modelo del carro");
        String modeloCarro = scanner.nextLine();

        System.out.println("Ingrese la marca del carro");
        String marcaCarro = scanner.nextLine();

        System.out.println("Ingrese el año del carro");
        String añoCarro = scanner.nextLine();

        System.out.println("Ingrese el numero de puertas");
        Long numPuertas = scanner.nextLong();

        Carro carro = new Carro(modeloCarro, marcaCarro, añoCarro, numPuertas);

        carro.mostrarInfo();
        scanner.close();
    }
}
