public class COFINS extends ImpostoFederal {
    private double desconto_base;

    // Construtor da Classe
    public COFINS(){}

    public COFINS(double desconto_base) {
        this.desconto_base = desconto_base;
    }

    // Construtores da Super Classe
    public COFINS(double aliquota, String sigla, NotaFiscal notaFiscal, int codigo_receita, double desconto_base) { // Herda de Imposto
        super(aliquota, sigla, notaFiscal, codigo_receita);
        this.desconto_base = desconto_base;
    }

    public COFINS(int codigo_receita, double desconto_base) { // Herda de ImpostoFederal
        super(codigo_receita);
        this.desconto_base = desconto_base;
    }




    public double getDesconto_base() {
        return desconto_base;
    }

    public void setDesconto_base(double desconto_base) {
        this.desconto_base = desconto_base;
    }


    
}
