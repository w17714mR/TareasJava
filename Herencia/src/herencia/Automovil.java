package herencia;

public class Automovil extends Vehiculo {
    
    private char numeroDePuertas;
    private boolean nuevo;
    private String patente;

    public Automovil() {
        this.numeroDePuertas = ' ';
        this.nuevo = true;
        this.patente = "";
    
    }

    public Automovil(char numeroDePuertas, boolean nuevo, String patente) {
        this.numeroDePuertas = numeroDePuertas;
        this.nuevo = nuevo;
        this.patente = patente;
    }

    public char getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(char numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Automovil{" + "numeroDePuertas=" + numeroDePuertas + ", nuevo=" + nuevo + ", patente=" + patente + '}';
    }

    @Override
    public void mostrarInformacionEspecifica() {
        super.mostrarInformacion();
        this.toString();
    }
}
