public class MesaAyuda {

    private int id;

    public Tecnico[] altaIncidente(String descripcion, string Especialidad);

    public long asignarTecnico(int idTecnico);

    public void atenderReclamo();

    public Servicio[] consultarServicios();

    public void inoformarCliente(int idCliente, int idIncidente)
    public void inoformarCliente(int idTecnico, int idIncidente)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MesaAyuda(int id) {
        this.id = id;
    }
}