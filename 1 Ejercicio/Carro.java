public class Carro extends Vehiculo {
    public Carro(String modelo, String marca, String año, Long numPuertas) {
        super(modelo, marca, año, numPuertas);
    }

    public void mostrarInfo() {
        System.out.println("El modelo del carro es: " + getModelo() +
                ", su marca es: " + getMarca() +
                ", su año es: " + getAño() +
                ", número de puertas: " + getNumPuertas());
    }
}
