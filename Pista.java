import java.util.ArrayList;

public class Pista implements GetId{
    private int id;
    private String numero;

    public Pista(int id, String numero){
        this.id = id;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "id=" + id 
            + "\nnumero=" + numero;
    }
}