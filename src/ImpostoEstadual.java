public class ImpostoEstadual extends Imposto{
    private String uf;

    public ImpostoEstadual(){}

    public ImpostoEstadual(double aliquota, String sigla, NotaFiscal notaFiscal, String uf) {
        super(aliquota, sigla, notaFiscal);
        this.uf = uf;
    }

    public ImpostoEstadual(String uf) {
        this.uf = uf;
    }




    @Override 
    public String getEsfera(){
        return "Estadual";
    }


    public String getUf() {
        return uf;
    }


    public void setUf(String uf) {
        this.uf = uf;
    }

    
}
