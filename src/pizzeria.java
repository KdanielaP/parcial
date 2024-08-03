public class pizzeria {
    abstract class pizzeria{
        protected String nombre;
        protected String tamano;
        protected double precio;

        public pizzeria(String nombre, String tamano, double precio) {
            this.nombre = nombre;
            this.tamano = tamano;
            this.precio = precio;
        }

        abstract void preparar();

        abstract void hornear();

        abstract void cortar();

        abstract void empacar();
    }
}
