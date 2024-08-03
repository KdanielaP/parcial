public class Ingredientes {interface Ingrediente {
    String obtenerNombre();
    int obtenerCantidad();
}
    class Masa implements Ingrediente {
        private String tipo;
        private int cantidad;

        public Masa(String tipo, int cantidad) {
            this.tipo = tipo;
            this.cantidad = cantidad;
        }

        public String obtenerNombre() {
            return tipo;
        }
        public int obtenerCantidad() {
            return cantidad;
        }
    }

}
