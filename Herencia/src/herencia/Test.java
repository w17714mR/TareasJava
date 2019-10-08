package herencia;

public class Test {
    
    public static void main(String[] args) {
        
        Camion camion1 = new Camion();
        camion1.setAnioFabricacion(1997);
        camion1.setCapacidadDeCarga(2000);
        camion1.setNumeroNeumaticos('8');
        camion1.setTolva(true);
        camion1.setColor("Verde");
        camion1.setKilometraje(1910);
        camion1.setModelo("Nítido");
        camion1.setNombre("El cruzafronteras");
        
        camion1.mostrarInformacion();
        camion1.mostrarInformacionEspecifica();
        
        Sucursal sucursal1 = new Sucursal();
        sucursal1.almacenarCamion(camion1);
        sucursal1.getArregloDeCamiones()[0].mostrarInformacionEspecifica();
        sucursal1.almacenarCamion(camion1);
        
        Automovil automovil1 = new Automovil();
        automovil1.setAnioFabricacion(2014);
        automovil1.setColor("Azul Metálico");
        automovil1.setKilometraje(68000);
        automovil1.setModelo("Sail");
        automovil1.setNombre("La nae");
        automovil1.setNuevo(false);
        automovil1.setNumeroDePuertas('5');
        automovil1.setPatente("GFVZ16");
        
        sucursal1.almacenarAuto(automovil1);
        sucursal1.almacenarAuto(automovil1);
        sucursal1.buscarAuto("GFVZ16");
        sucursal1.buscarAuto("");
        
        System.out.println("En la sucursal quedan " + sucursal1.calcularEspacioDisponibleParaCamiones() + " espacios disponibles.");
        System.out.println("En la sucursal hay " + sucursal1.calcularTotalDeUnidades() + " unidades almacenadas.");
        sucursal1.venderAuto("");
        sucursal1.venderAuto("GFVZ16");
        System.out.println("En la sucursal hay " + sucursal1.calcularTotalDeUnidades() + " unidades almacenadas.");
        sucursal1.almacenarAuto(automovil1);
        
        sucursal1.mostrarInformeDiario();
    }
    
}
