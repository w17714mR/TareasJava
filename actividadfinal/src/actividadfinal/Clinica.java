package actividadfinal;

import java.util.ArrayList;

public class Clinica {

    private ArrayList<Persona> coleccionDePersonas;

    public Clinica() {
        this.coleccionDePersonas = new ArrayList<>();
    }

    public Clinica(ArrayList<Persona> coleccionDePersonas) {
        this.coleccionDePersonas = coleccionDePersonas;
    }

    public ArrayList<Persona> getColeccionDePersonas() {
        return coleccionDePersonas;
    }

    public void setColeccionDePersonas(ArrayList<Persona> coleccionDePersonas) {
        this.coleccionDePersonas = coleccionDePersonas;
    }

    @Override
    public String toString() {
        return "Clinica{" + "coleccionDePersonas=" + coleccionDePersonas + '}';
    }

    public void buscarTrabajador(String rut) {
        boolean validador = false;
        Persona auxiliar = null;
        if (this.coleccionDePersonas.size() == 0) {
            System.out.println("Colección vacía.");
        }
        if (this.coleccionDePersonas.size() != 0) {
            for (Persona persona : this.coleccionDePersonas) {
                if (persona.getRut().equals(rut)) {
                    validador = true;
                    auxiliar = persona;
                }
            }
        }
        if (validador) {
            System.out.println("Persona encontrada: ");
            auxiliar.mostrarInformacionEspecifica();
        } else {
            System.out.println("Pesona no encontrada.");
        }
    }

    public void listarTrabajadoresConSueldo() {
    }

    public void almacenarTrabajador(Persona persona1) {
        boolean validador = false;
        if (this.getColeccionDePersonas().size() == 0) {
            validador = false;
        } else {
            for (Persona persona : this.coleccionDePersonas) {
                if (persona.getRut().equals(persona1.getRut())) {
                    validador = true;
                }
            }
        }
        if (validador) System.out.println("Persona ya se encuentra agregada.");
        else {
            this.getColeccionDePersonas().add(persona1);
            System.out.println("Trabajador añadido: "+persona1.getPnombre());
        }
    }

}
