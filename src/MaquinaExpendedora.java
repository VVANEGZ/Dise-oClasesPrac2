import java.util.*;
public class MaquinaExpendedora {
    private  Impresora impresora;
    private Monedero monedero;
    private List <Billete> tipoDeBillete;

    public MaquinaExpendedora(Impresora impresora, Monedero monedero, List<Billete> tipoDeBillete) {
        this.impresora = impresora;
        this.monedero = monedero;
        this.tipoDeBillete = new ArrayList<>();
    }

    public void mostrarMenu(){
        System.out.println("BIENVENIDO \n ======MENU=====");
        do{
            System.out.println("Selecciona un tipo de billete: ");
        } while(!tipoDeBillete.isEmpty()); //checo
    }
    public void seleccionarTipoBillete(int Billete){

    }
    public void procesarPago(){

    }
    public void imprimirBillete(int billete){}
    public void devolverCambio(){}

}
