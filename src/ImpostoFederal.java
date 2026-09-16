public class ImpostoFederal extends Imposto{
    private int codigo_receita;

    public ImpostoFederal(){}

    public ImpostoFederal(double aliquota, String sigla, NotaFiscal notaFiscal, int codigo_receita) {
        super(aliquota, sigla, notaFiscal);
        this.codigo_receita = codigo_receita;
    }

    public ImpostoFederal(int codigo_receita) {
        this.codigo_receita = codigo_receita;
    }

    @Override 
    public String getEsfera(){
        return "Federal";
    }

    public int getCodigo_receita() {
        return codigo_receita;
    }

    public void setCodigo_receita(int codigo_receita) {
        this.codigo_receita = codigo_receita;
    }

    

}
