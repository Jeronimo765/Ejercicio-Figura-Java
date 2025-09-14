import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su animal:");
        String nombrePerro = scanner.nextLine();

        System.out.println("Ingrese de la edad de su animal:");
        int edadPerro = scanner.nextInt(); 
        scanner.nextLine(); 

        System.out.println("Ingrese la raza de su animal");
        String razaAnimal = scanner.nextLine();

        Perro perrito = new Perro(nombrePerro, edadPerro, razaAnimal);

        perrito.mostrarInfo();
        scanner.close();
    }
}