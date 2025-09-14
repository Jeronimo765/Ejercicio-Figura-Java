import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = scanner.nextLine();

        System.out.println("Ingrese el salario del empleado:");
        int salarioEmpleado = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el departamento:");
        String departamentoGerente = scanner.nextLine();

        Gerente gerente1 = new Gerente(nombreEmpleado, salarioEmpleado, departamentoGerente);

        gerente1.mostrarInfo();
        scanner.close();
    }
}
