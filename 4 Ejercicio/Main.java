import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto es:");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        int precioProducto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la fecha de vencimiento:");
        String fechaVencimiento = scanner.nextLine();

        Alimento alimento1 = new Alimento(nombreProducto, precioProducto, fechaVencimiento);

        alimento1.mostrarInfo();
        scanner.close();
    }
}
