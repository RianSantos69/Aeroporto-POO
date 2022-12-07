import java.util.ArrayList;

public class Companhia implements GetId{
    private int id;
    private String nome;
    private String cnpj;
    private ArrayList<Aviao> avioes;

    public Companhia(int id, String nome, String cnpj){
        this.id = id;
        this.nome = nome;
         this.cnpj = cnpj;
         this.avioes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Aviao> getAvioes() {
        return avioes;
    }

    public void setAviao(Aviao Aviao) {
        this.avioes.add(Aviao);
    }

    @Override
    public String toString() {
        return "id =" + id 
            + "\nnome =" + nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Companhia)) {
            return false;
        }
        
        Companhia other = (Companhia) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}