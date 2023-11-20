public class Comercial {

    private int id;
    private String nombreOperario;


    public void altaCliente(Cliente cliente);

    public void bajaCliente(int idCliente);

    public void modificarCliente(int idCliente, Cliente cliente);

    public Comercial(int id, String nombreOperario) {
        this.id = id;
        this.nombreOperario = nombreOperario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreOperario() {
        return nombreOperario;
    }

    public void setNombreOperario(String nombreOperario) {
        this.nombreOperario = nombreOperario;
    }
}