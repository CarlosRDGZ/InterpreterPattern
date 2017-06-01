package interpreterpattern;

public class Cliente {
    public Contexto contexto;
    
    public Cliente(Contexto contexto) {
        this.contexto = contexto;
    }
    
    public String interpretar(String string) {
        Expresion expresion = null;
        
        if(string.toUpperCase().contains("BIN"))
            expresion = new DecimalABinario(Integer.valueOf(string.substring(0,string.indexOf(" "))));
        else if(string.toUpperCase().contains("HEX"))
            expresion = new DecimalAHexadecimal(Integer.valueOf(string.substring(0,string.indexOf(" "))));
        else if(string.toUpperCase().contains("OCT"))
            expresion = new DecimalAOctal(Integer.valueOf(string.substring(0,string.indexOf(" "))));
        else return string;
        
        return string + " es " + expresion.interpretar(contexto).toUpperCase();
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente(new Contexto());
        
        System.out.println(cliente.interpretar("178 a OCTAL"));
        System.out.println(cliente.interpretar("178 a Binario"));
        System.out.println(cliente.interpretar("178 a hexadecimal"));
    }
}
