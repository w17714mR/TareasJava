package herencia;

public class Camion extends Vehiculo {

    private float capacidadDeCarga;
    private char numeroNeumaticos;
    private boolean tolva;

    public Camion() {
        this.capacidadDeCarga = -1;
        this.numeroNeumaticos = ' ';
        this.tolva = true;
        System.out.println("Camión creado.");

    }

    public Camion(float capacidadDeCarga, char numeroNeumaticos, boolean tolva) {
        this.capacidadDeCarga = capacidadDeCarga;
        this.numeroNeumaticos = numeroNeumaticos;
        this.tolva = tolva;
    }

    public float getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(float capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public char getNumeroNeumaticos() {
        return numeroNeumaticos;
    }

    public void setNumeroNeumaticos(char numeroNeumaticos) {
        this.numeroNeumaticos = numeroNeumaticos;
    }

    public boolean isTolva() {
        return tolva;
    }

    public void setTolva(boolean tolva) {
        this.tolva = tolva;
    }

    @Override
    public String toString() {
        return "Camion{" + "capacidadDeCarga=" + capacidadDeCarga + ", numeroNeumaticos=" + numeroNeumaticos + ", tolva=" + tolva + '}';
    }

    @Override
    public void mostrarInformacionEspecifica() {
        super.mostrarInformacion();
        System.out.println(this.toString());;
    }

}
