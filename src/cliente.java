public class Cliente {

    private int id;
    private String razonSocial;
    private String cuit;
    private Incidente[] incidentes;
    private Servicio[] servicios;

    public Cliente(int id, String razonSocial, String cuit, Incidente[] incidentes, Servicio[] servicios) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.incidentes = incidentes;
        this.servicios = servicios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Incidente[] getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(Incidente[] incidentes) {
        this.incidentes = incidentes;
    }

    public Servicio[] getServicios() {
        return servicios;
    }

    public void setServicios(Servicio[] servicios) {
        this.servicios = servicios;
    }
}