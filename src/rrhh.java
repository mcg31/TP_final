public class Rrhh {

    private int id;
    private Tecnicos tecnicos;


    public void altaTecnico(Tecnico tecnico);

    public void bajaTecnico(int idTecnico);

    public void modificarTecnico(int idTecnico, Tecnico tecnico);

    public Incidente[] emitirReporte(int idTecnico);

    public int obtenerIdTecnicoEficiente(int dias);

    public int obtenerIdTecnicoEficienteEspecilidad(int dias, Especialidad especialidad)

    public obtenerIdTecnicoMasRapido(int dias, Especialidad especialidad)

    public Rrhh() {
    }

    public Rrhh(int id, Tecnicos tecnicos) {
        this.id = id;
        this.tecnicos = tecnicos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tecnicos getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(Tecnicos tecnicos) {
        this.tecnicos = tecnicos;
    }
}