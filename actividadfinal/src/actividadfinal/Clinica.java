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

    public void buscarTrabajador(Persona persona1) {
        boolean validador = false;
        if (this.coleccionDePersonas.size() != 0) {
            for (Persona persona : this.getColeccionDePersonas()) {
                if (persona.getRut().equals(persona1.getRut())) {
                    System.out.println("Rut ya pertenece a la colección.");
                }
            }
            
            
            
        }

    }
}
