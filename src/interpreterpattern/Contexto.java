package interpreterpattern;

public class Contexto
{
    public String aBinario(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public String aHexadecimal(int decimal) {
        return Integer.toHexString(decimal);
    }
    
    public String aOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
}
