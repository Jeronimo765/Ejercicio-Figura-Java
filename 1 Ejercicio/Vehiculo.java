public class Vehiculo {
    private String modelo;
    private String marca;
    private String año;
    private Long numPuertas;

    public Vehiculo(String modelo, String marca, String año, Long numPuertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.numPuertas = numPuertas;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getAño() {
        return año;
    }

    public Long getNumPuertas() {
        return numPuertas;
    }
}
