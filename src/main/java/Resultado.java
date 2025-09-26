public class Resultado {

    private int valor1;
    private int valor2;

    public Resultado(int v1, int v2){
        this.valor1 = v1;
        this.valor2 = v2;
    }

    public String toXml() {
        String s = "";
        s += "<resultado>\n";
        s += "<valor1>" + valor1 + "</valor1>\n";
        s += "<valor2>" + valor2 + "</valor2>\n";
        s += "</resultado>\n";
        return s;
    }

    public static void main(String[] args) {
        Resultado r1 = new Resultado(7,5);
        System.out.println(r1.toXml());
    }
}
