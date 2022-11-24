public class ObjetoVendible {
    private double precioLista;
    private String nombre;

    public ObjetoVendible(double precioLista, String nombre) {
        this.precioLista = precioLista;
        this.nombre = nombre;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
