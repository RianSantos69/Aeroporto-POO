import java.util.ArrayList;

public class Jato extends Aeromodelo{
    private String cor;
    private int velocidade;

    private static ArrayList<Jato> jatos = new ArrayList<>();

    public Jato(String marca, String modelo, String cor, int velocidade, int idCompanhia, Companhia companhia){
        super(GetId.getNextId(jatos), marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public static ArrayList<Jato> getJatos() {
        return jatos;
    }

    public static void setJato(Jato jato) {
        jatos.add(jato);
    }

    @Override
    public String toString() {
        return super.toString() 
            + "\ncor =" + cor
            + "\nvelocidade =" + velocidade + "\n";
    }

    public static Jato getJatoById(int id) throws Exception {
        for (Jato jato : jatos) {
            if (jato.getId() == id) {
                return jato;
            }
        }
        throw new Exception("Jato não encontrada");
    }

    public static void excluir(int id) throws Exception {
        Jato jato = getJatoById(id);
        jatos.remove(jato);
    }
}