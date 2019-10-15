package actividadfinal;

public interface IAcciones {
    int BONO_MEDICO = 100000;
    int BONO_PARAMEDICO = 80000;

    public abstract void mostrarInformacionEspecifica();
    public abstract int calcularSueldo(int horasTrabajadas);
}
