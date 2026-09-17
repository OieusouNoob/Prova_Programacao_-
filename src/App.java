import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Imposto> objImposto = new ArrayList<>();
        NotaFiscal objNotaFiscal = new NotaFiscal(1, "1", 10000.00, objImposto);

        ICMS objICMS = new ICMS(12, "ICMS", objNotaFiscal, "GO", 50f);
        PIS objPis = new PIS(1.65, "PIS", objNotaFiscal, 1);
        COFINS objCofins = new COFINS(7.6,"COFINS", objNotaFiscal, 01, 50f);

        objImposto.add( objICMS );
        objImposto.add( objCofins );
        objImposto.add( objPis );

        objNotaFiscal.setImpostos( objImposto );

        objNotaFiscal.getImpostos().forEach( tributos ->{
            System.out.println("\nNota Fiscal: " + tributos.getNotaFiscal().getNumero_nota() );
            System.out.println("Sigla: " + tributos.getSigla());
            System.out.println("Esfera: " + tributos.getEsfera());
            System.out.println("Base de Cálculo:" +  tributos.getNotaFiscal().getValor_operacao() );
            System.out.println("Valor Apurado: " + tributos.calcularBC( tributos.getNotaFiscal().getValor_operacao() ));

          }

        );  
    }
}