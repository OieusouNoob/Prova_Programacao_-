public class ICMS extends ImpostoEstadual {
    private double reducao_bc;

    public ICMS(){}

    
    public ICMS(double reducao_bc) {
        this.reducao_bc = reducao_bc;
    }

    public ICMS(double aliquota, String sigla, NotaFiscal notaFiscal, String uf, double reducao_bc) { 
        super(aliquota, sigla, notaFiscal, uf);
        this.reducao_bc = reducao_bc;
    }

    public ICMS(String uf, double reducao_bc) {
        super(uf);
        this.reducao_bc = reducao_bc;
    }

    @Override 
    public double calcularBC( double valor ){
        return 1f;
    }

    public double getReducao_bc() {
        return reducao_bc;
    }

    public void setReducao_bc(double reducao_bc) {
        this.reducao_bc = reducao_bc;
    }


    
}
