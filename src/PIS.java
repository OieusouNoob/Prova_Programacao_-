public class PIS extends ImpostoFederal{
    
    public PIS() {
    }
    
    public PIS(double aliquota, String sigla, NotaFiscal notaFiscal, int codigo_receita) { // Avó == Imposto
        super(aliquota, sigla, notaFiscal, codigo_receita);
    }

    public PIS(int codigo_receita) { // Mãe == ImpostoFederal
        super(codigo_receita);
    }




    
    
}
