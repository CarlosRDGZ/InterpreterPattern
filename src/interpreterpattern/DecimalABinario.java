package interpreterpattern;

public class DecimalABinario implements Expresion{
    private int decimal;
    
    public DecimalABinario(int decimal) {
        this.decimal = decimal;
    }
    
    public String interpretar(Contexto contexto) {
        return contexto.aBinario(decimal);
    }
}
