package actividadfinal;

public class Paramedico extends Persona implements IAcciones {

    private int valorHora;
    private char tipoTurno;

    public Paramedico() {
        super();
        this.tipoTurno = ' ';
        this.valorHora = 0;
    }

    public Paramedico(int valorHora, char tipoTurno, String rut, String pnombre, String snombre, String apaterno, String amaterno, String edad, char sexo) {
        super(rut, pnombre, snombre, apaterno, amaterno, edad, sexo);
        this.valorHora = valorHora;
        this.tipoTurno = tipoTurno;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public char getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(char tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    @Override
    public String toString() {
        return "Paramedico{" + "valorHora=" + valorHora + ", tipoTurno=" + tipoTurno + '}';
    }

    @Override
    public void mostrarInformacionEspecifica() {
        super.mostrarInformacionPersona();
        this.toString();
    }
}
