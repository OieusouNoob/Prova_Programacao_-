import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Imposto> objImposto = new ArrayList<>();// Criação da Lista de Objetos do tipo Imposto

        ICMS objICMS = new ICMS();
        PIS objPis = new PIS();
        COFINS objCofins = new COFINS();

        objImposto.add( objICMS );
        objImposto.add( objCofins );
        objImposto.add( objPis );

        NotaFiscal objNotaFiscal = new NotaFiscal();

        objNotaFiscal.setImpostos( objImposto );

    }
}