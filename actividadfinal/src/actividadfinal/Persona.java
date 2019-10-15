package actividadfinal;

public abstract class Persona implements IAcciones {

    private String rut;
    private String pnombre;
    private String snombre;
    private String apaterno;
    private String amaterno;
    private String edad;
    private char sexo;

    public Persona() {
        this.rut = "";
        this.pnombre = "";
        this.snombre = "";
        this.apaterno = "";
        this.amaterno = "";
        this.edad = "";
        this.sexo = ' ';
        System.out.println("PERSONA CREADA.");
    }

    public Persona(String rut, String pnombre, String snombre, String apaterno, String amaterno, String edad, char sexo) {
        this.rut = rut;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'F' || sexo == 'M' || sexo == 'O') {
            this.sexo = sexo;
        } else {
            System.out.println("Caracter inválido");
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", pnombre=" + pnombre + ", snombre=" + snombre + ", apaterno=" + apaterno + ", amaterno=" + amaterno + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

    // MÉTODOS CUSTOMER
    public void mostrarInformacionPersona() {
        System.out.println("INFORMACIÓN PERSONAL: ");
        System.out.println("------------------------");
        System.out.println("NOMBRE: " + this.getPnombre() + " " + this.snombre + " " + this.apaterno + " " + this.amaterno);
        System.out.println("EDAD: " + this.getEdad());
        System.out.println("SEXO: " + this.getSexo());
    }
}
