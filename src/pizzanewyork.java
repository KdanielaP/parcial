public class pizzanewyork {
    class PizzaNuevaYork extends pizzanewyork {
        private String estiloCorte;

        // Constructor
        public PizzaNuevaYork(String nombre, String tamano, double precio, String estiloCorte) {
            this.nombre = nombre;
            this.tamano = tamano;
            this.precio = precio;
            this.estiloCorte = estiloCorte;
        }

        void preparar() {
            System.out.println("Preparando pizza Nueva York: " + nombre);
        }

        void hornear() {
            System.out.println("Horneando pizza Nueva York: " + nombre);
        }

        void cortar() {
            System.out.println("Cortando pizza Nueva York: " + nombre + " con estilo de corte " + estiloCorte);
        }
        void empacar() {
            System.out.println("Empacando pizza Nueva York: " + nombre);
        }
    }
}