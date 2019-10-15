package actividadfinal;

public interface IAcciones {
    private int BONO_MEDICO = 100000;
    private int BONO_PARAMEDICO = 80000;

    public abstract void mostrarInformacionEspecifica();
    public abstract void calcularSueldo(Hint horasTrabajadas);
}
