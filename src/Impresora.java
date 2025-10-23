import java.util.HashMap;
import java.util.Map;

public class Impresora {
    private boolean tieneTinta;
    private Map<Integer, Integer> stockPorTipo;

    public Impresora(boolean tieneTinta) {
        this.tieneTinta = tieneTinta;
        HashMap<Object, Object> sotckPorTipo = new HashMap<>();
    }

    public void setStock(int tipo, int valor) {
        stockPorTipo.put(tipo, valor);
    }
    public int getStock(int tipo) {
        return stockPorTipo.get(tipo);
    }
    public boolean tieneTinta(){
        return true;
    }
    public void imprimirYExpulsarBillete(int billete){
        //
    }
    public boolean tieneBillete(int billete){
        return true;
    }
}
