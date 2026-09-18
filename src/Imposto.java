public class Imposto {

    private double aliquota ;
    private String sigla;
    private NotaFiscal notaFiscal;

    public Imposto(double aliquota, String sigla, NotaFiscal notaFiscal) {
        this.aliquota = aliquota;
        this.sigla = sigla;
        this.notaFiscal = notaFiscal;
    }

    public Imposto(){}

    

    public void salvar(){
        System.out.println("Salvando Imposto");
    }

    public void alterar(){
        System.out.println("Alterando Imposto");
    }
    public void excluir(){
        System.out.println("Excluindo Imposto");
    }
    public void pesquisar(){
        System.out.println("Pesquisando Imposto");
    }

    public double calcularBC( double valor ){
        return valor * (this.aliquota / 100);
    }

    public double calcularValor( double valor ){
        return valor;
    }

    public String getEsfera(){ // Esfera == Orgão que está arrecando este imposto
        return "esfera";
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

        
}
