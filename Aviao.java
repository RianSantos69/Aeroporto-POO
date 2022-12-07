import java.util.ArrayList;

public class Aviao extends Aeromodelo{
    private String prefixo;
    private int capacidade;
    private int idCompanhia;
    private Companhia companhia;

    private static ArrayList<Aviao> avioes = new ArrayList<>();

    public Aviao(String marca, String modelo, String prefixo, int capacidade, int idCompanhia, Companhia companhia){
        super(GetId.getNextId(avioes), marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.idCompanhia = companhia.getId();
        this.companhia = companhia;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public static ArrayList<Aviao> getAvioes() {
        return avioes;
    }

    public static void setAviao(Aviao aviao) {
        avioes.add(aviao);
    }

    @Override
    public String toString() {
        return super.toString() 
            + "\nprefixo =" + prefixo
            + "\ncapacidade =" + capacidade + "\n";
    }

    public static Aviao getAviaoById(int id) throws Exception {
        for (Aviao aviao : avioes) {
            if (aviao.getId() == id) {
                return aviao;
            }
        }
        throw new Exception("Aviao não encontrada");
    }

    public static void excluir(int id) throws Exception {
        Aviao aviao = getAviaoById(id);
        avioes.remove(aviao);
    }
}