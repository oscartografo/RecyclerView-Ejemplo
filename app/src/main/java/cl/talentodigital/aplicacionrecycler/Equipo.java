package cl.talentodigital.aplicacionrecycler;

class Equipo {
    private String nombreEquipo;
    private String copasNacionales;
    private String copasInternacionales;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCopasNacionales() {
        return copasNacionales;
    }

    public void setCopasNacionales(String copasNacionales) {
        this.copasNacionales = copasNacionales;
    }

    public String getCopasInternacionales() {
        return copasInternacionales;
    }

    public void setCopasInternacionales(String copasInternacionales) {
        this.copasInternacionales = copasInternacionales;
    }

    public Equipo(String nombreEquipo, String copasNacionales, String copasInternacionales) {
        this.nombreEquipo = nombreEquipo;
        this.copasNacionales = copasNacionales;
        this.copasInternacionales = copasInternacionales;


    }
}
