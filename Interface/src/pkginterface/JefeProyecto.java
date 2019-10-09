package javaapplication3;

public class JefeProyecto extends Persona implements IAcciones {

    private int horasTrabajadas;
    private int valorHora;

    public JefeProyecto() {
        super();
        this.horasTrabajadas = 0;
        this.valorHora = 0;
    }

    public JefeProyecto(int horasTrabajadas, int valorHora, String nombre, String rut, int edad) {
        super(nombre, rut, edad);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "JefeProyecto{" + "horasTrabajadas=" + horasTrabajadas + ", valorHora=" + valorHora + '}';
    }

    @Override
    public void mostrarInformacionEspecifica() {
        mostrarInformacion();
        System.out.println("VALOR HORA: " + this.getValorHora());
        System.out.println("HORAS TRABAJADAS: " + this.getHorasTrabajadas());
    }

    @Override
    public void mostrarSueldo() {
        System.out.println("SUELDO BASE: " + (this.getValorHora() * this.getHorasTrabajadas()) + BONO_TRABAJADOR);
    }
;
}
