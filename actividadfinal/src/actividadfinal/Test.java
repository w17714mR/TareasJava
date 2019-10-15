
package actividadfinal;

public class Test {

    public static void main(String[] args) {
        
        Doctor doctor1 = new Doctor();
        
        doctor1.setPnombre("William");
        doctor1.setSnombre("Alberto");
        doctor1.setApaterno("Rehel");
        doctor1.setAmaterno("Rifo");
        doctor1.setEdad("28");
        doctor1.setRut("1111-1");
        doctor1.setSexo('M');
        doctor1.setAnhiosExperiencia(6);
        doctor1.setEspecialidad("Oncología");
        doctor1.setSueldoBase(600000);
        
        Paramedico paramedico1 = new Paramedico();
        paramedico1.setPnombre("Alicia");
        paramedico1.setSnombre("Beatríz");
        paramedico1.setApaterno("Bustamante");
        paramedico1.setAmaterno("Sandoval");
        paramedico1.setEdad("26");
        paramedico1.setRut("2222-2");
        paramedico1.setSexo('F');
        paramedico1.setTipoTurno('2');
        paramedico1.setValorHora(3000);
        
        Clinica clinica1 = new Clinica();

        clinica1.buscarTrabajador("1111-1");
        clinica1.almacenarTrabajador(doctor1);
        clinica1.buscarTrabajador("1111-1");
        clinica1.eliminarTrabajador(doctor1);
        clinica1.eliminarTrabajador(doctor1);
        clinica1.almacenarTrabajador(doctor1);
        clinica1.almacenarTrabajador(paramedico1);
        
        clinica1.listarTrabajadores();
        
        clinica1.listarTrabajadoresConSueldo();
    }
    
}
