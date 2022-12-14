import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<ObjetoVendible> objetoVendibles;

    public Cliente(String nombre) {
        this.nombre = nombre;
        setObjetoVendibles(new ArrayList<ObjetoVendible>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ObjetoVendible> getObjetoVendibles() {
        return objetoVendibles;
    }

    public void setObjetoVendibles(ArrayList<ObjetoVendible> objetoVendibles) {
        this.objetoVendibles = objetoVendibles;
    }
}
