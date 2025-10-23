public class Monedero {
    private double dinero;
    private double caja;

    public Monedero() {
        dinero=0.0;
        caja=0.0;
    }

    public boolean esPosibleSuministrar(int billete){
        return true;
    }
    public void suministrar(int billete){
    }
    public void devolverCantidadIntroducida(){
        //algo
    }
    public int cantidadIntroducida(){
        return 0;
    }
}
