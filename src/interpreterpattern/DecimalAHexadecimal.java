package interpreterpattern;

public class DecimalAHexadecimal implements Expresion{
    private int decimal;
    
    public DecimalAHexadecimal(int decimal) {
        this.decimal = decimal;
    }
    
    public String interpretar(Contexto contexto) {
        return contexto.aHexadecimal(decimal);
    }
}
