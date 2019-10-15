package actividadfinal;

public class Doctor extends Persona implements IAcciones {

    String especialidad;
    int anhiosExperiencia;
    int sueldoBase;

    public Doctor() {
        super();
        this.especialidad = "";
        this.anhiosExperiencia = 0;
        this.sueldoBase = 0;
    }

    public Doctor(String especialidad, int anhiosExperiencia, int sueldoBase, String rut, String pnombre, String snombre, String apaterno, String amaterno, String edad, char sexo) {
        super(rut, pnombre, snombre, apaterno, amaterno, edad, sexo);
        this.especialidad = especialidad;
        this.anhiosExperiencia = anhiosExperiencia;
        this.sueldoBase = sueldoBase;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnhiosExperiencia() {
        return anhiosExperiencia;
    }

    public void setAnhiosExperiencia(int anhiosExperiencia) {
        this.anhiosExperiencia = anhiosExperiencia;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Doctor{" + "especialidad=" + especialidad + ", anhiosExperiencia=" + anhiosExperiencia + ", sueldoBase=" + sueldoBase + '}';
    }

    @Override
    public void mostrarInformacionEspecifica() {
        super.mostrarInformacionPersona();
        this.toString();
    }
}
