public class Partido {

    private String fase;
    private int equipo1;
    private int equipo2;

    private Resultado r1;
    private Resultado r2;
    private Resultado r3;

    public Partido(String queFase, int e1, int e2) {
        this.fase = queFase;
        this.equipo1 = e1;
        this.equipo2 = e2;
    }

    public void meter(int valor1, int valor2) {
        Resultado r = new Resultado(valor1, valor2);
        if (r1 == null) { r1 = r; return; }
        if (r2 == null) { r2 = r; return; }
        if (r3 == null) { r3 = r; return; }
    }

    public int cuantosResultados() {
        int n = 0;
        if (r1 != null) { n++; }
        if (r2 != null) { n++; }
        if (r3 != null) { n++; }
        return n;
    }

    public static void main(String[] args) {
        Partido p1 = new Partido("final", 1, 2);
        p1.meter(5,7);
        p1.meter(4,6);
        System.out.println(p1.cuantosResultados());
    }

}
