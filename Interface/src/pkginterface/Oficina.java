package javaapplication3;

import java.util.ArrayList;

public class Oficina {

    private ArrayList<Persona> listaTrabajadores;

    public Oficina() {
        this.listaTrabajadores = new ArrayList<>();
    }

    public Oficina(ArrayList<Persona> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public ArrayList<Persona> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Persona> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public void almacenarTrabajador(Persona trabajador) {
        boolean validador = false;
        for (Persona persona : this.listaTrabajadores) {
            if (persona.getRut().equals(trabajador.getRut())) {
                validador = true;
                break;
            }
        }
        if (!validador) {
            this.listaTrabajadores.add(trabajador);
        } else {
            System.out.println("RUT YA REGISTRADO.");
        }
    }
}
