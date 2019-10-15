
package actividadfinal;

public class Test {

    public static void main(String[] args) {
        
        Doctor doctor1 = new Doctor();
        
        doctor1.setPnombre("William");
        doctor1.setSnombre("Alberto");
        doctor1.setApaterno("Rehel");
        doctor1.setAmaterno("Rifo");
        doctor1.setEdad("28");
        doctor1.setRut("16387103-3");
        doctor1.setSexo('F');
        doctor1.setAnhiosExperiencia(6);
        doctor1.setEspecialidad("Oncología");
        doctor1.setSueldoBase(600000);
        
        doctor1.mostrarInformacionPersona();
        doctor1.mostrarInformacionEspecifica();
        
        Clinica clinica1 = new Clinica();
        clinica1.buscarTrabajador("16387103-3");
        clinica1.getColeccionDePersonas().add(doctor1);
        clinica1.buscarTrabajador("16387103-3");
        
        clinica1.almacenarTrabajador(doctor1);
        clinica1.getColeccionDePersonas().remove(doctor1);
        clinica1.almacenarTrabajador(doctor1);
        
    }
    
}
