public class Tecnico {

    private int id;
    private String nombre;
    private String apellido|;
    private Incidente[] incidentes;
    private Especialidad[] especialidad;



    public void resolverIncidente(int idIncidente);

    public void notificarCliente(int idIncidente);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Incidente[] getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(Incidente[] incidentes) {
        this.incidentes = incidentes;
    }

    public Especialidad[] getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad[] especialidad) {
        this.especialidad = especialidad;
    }
}