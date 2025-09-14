public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarInfo() {
        System.out.println("El nombre del empleado es: " + getNombre());
        System.out.println("Su salario es: " + getSalario());
        System.out.println("Su departamento es: " + getDepartamento());
    }
}
