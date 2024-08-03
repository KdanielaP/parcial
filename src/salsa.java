public class salsa {
    class Salsa implements Main.Ingrediente {
    private String sabor;
    private int cantidad;

    public Salsa(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return sabor;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}


}
