public class Billete {
    private int tipoBillete;
    private String nombre;
    private float precio;

    public Billete(int tipoBillete, String nombre, float precio) {
        this.tipoBillete = tipoBillete;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Billete() {
    }

    @Override
    public String toString() {
        return "Billete: " +
                "tipo de billete " + tipoBillete +
                ", nombre " + nombre +
                ", precio " + precio ;
    }

    public float getPrecio() {
        return precio;
    }
    public int getTipoBillete() {
        return tipoBillete;
    }

    public String getNombre() {
        return nombre;
    }
}
