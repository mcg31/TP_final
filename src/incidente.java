public class Incidente {

    private int id;
    private String descripcion;
    private Especialidad[] especialidades;
    private String estado; //Podría ser también un enumerado

    public Incidente(int id, String descripcion, Especialidad[] especialidades, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.especialidades = especialidades;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Especialidad[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidad[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}