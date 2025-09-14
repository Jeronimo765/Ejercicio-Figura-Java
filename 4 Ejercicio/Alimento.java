public class Alimento extends Producto{
    private String fechaVencimiento;

    public Alimento(String nombre, int precio, String fechaVencimiento){
        super (nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void mostrarInfo() {
        System.out.println("El nombre del alimento es: " + getNombre());
        System.out.println("Su precio es: " + getPrecio());
        System.out.println("Su fecha de vencimiento es:: " + getFechaVencimiento());
    }
}
