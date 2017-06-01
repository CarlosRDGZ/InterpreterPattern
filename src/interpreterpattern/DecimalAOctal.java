package interpreterpattern;

public class DecimalAOctal implements Expresion{
    private int decimal;
    
    public DecimalAOctal(int decimal) {
        this.decimal = decimal;
    }
    
    public String interpretar(Contexto contexto) {
        return contexto.aOctal(decimal);
    }
}
