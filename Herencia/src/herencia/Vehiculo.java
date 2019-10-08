package herencia;

public abstract class Vehiculo {

    private String nombre;
    private String modelo;
    private int anioFabricacion;
    private String color;
    private int kilometraje;

    public Vehiculo() {
        this.nombre = "";
        this.modelo = "";
        this.anioFabricacion = -1;
        this.color = "";
        this.kilometraje = -1;

        System.out.println("Vehículo creado");
    }

    public Vehiculo(String nombre, String modelo, int anioFabricacion, String color, int kilometraje) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void mostrarInformacion() {
        System.out.println("Vehiculo{" + "nombre=" + nombre + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + ", color=" + color + ", kilometraje=" + kilometraje + '}');
    }

    public abstract void mostrarInformacionEspecifica();

}
