public class Perro extends Animal {
    private String raza;
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrarInfo() {
        System.out.println("El nombre del animal es:" + getNombre() +
                "Su edad es: " + getEdad() +
                "Su raza es:" + getRaza());

    }
}
