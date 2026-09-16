import java.util.ArrayList;

public class NotaFiscal {
    
    private int id;
    private String numero_nota;
    private double valor_operacao;

    private ArrayList<Imposto> impostos;


    public NotaFiscal(int id, String numero_nota, double valor_operacao, ArrayList<Imposto> impostos) {
        this.id = id;
        this.numero_nota = numero_nota;
        this.valor_operacao = valor_operacao;
        this.impostos = impostos;
    }

    public NotaFiscal(){}


    public void adicionar( int imposto ){

    }

    public double getImpostoEstadual(){
        return 1f;
    }

    public double getTotalFederais(){
        return 1f;
    }

    public void imprimirValores(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_nota() {
        return numero_nota;
    }

    public void setNumero_nota(String numero_nota) {
        this.numero_nota = numero_nota;
    }

    public double getValor_operacao() {
        return valor_operacao;
    }

    public void setValor_operacao(double valor_operacao) {
        this.valor_operacao = valor_operacao;
    }

    public ArrayList<Imposto> getImpostos() {
        return impostos;
    }

    public void setImpostos(ArrayList<Imposto> impostos) {
        this.impostos = impostos;
    }

    
}
