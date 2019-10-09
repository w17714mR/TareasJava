package javaapplication3;

public class Programador extends Persona implements IAcciones {

    private int sueldoBase;
    private String especialidad;

    public Programador() {
        super();
        this.especialidad = "";
        this.sueldoBase = 0;
    }

    public Programador(int sueldoBase, String especialidad, String nombre, String rut, int edad) {
        super(nombre, rut, edad);
        this.sueldoBase = sueldoBase;
        this.especialidad = especialidad;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Programador{" + "sueldoBase=" + sueldoBase + ", especialidad=" + especialidad + '}';
    }

    @Override
    public void mostrarInformacionEspecifica() {
        mostrarInformacion();
        System.out.println("SUELDO BASE: " + this.getSueldoBase());
        System.out.println("ESPECIALIDAD: " + this.getEspecialidad());
    }

    @Override
    public void mostrarSueldo() {
        System.out.println("SUELDO BASE: " + this.getSueldoBase() + BONO_TRABAJADOR);
    }
;
}
