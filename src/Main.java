//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    abstract class pizzeria {
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

    // Pizza Nueva York
    class PizzaNuevaYork extends pizzeria {
        private String estiloCorte;

        // Constructor
        public PizzaNuevaYork(String nombre, String tamano, double precio, String estiloCorte) {
            super(nombre, tamano, precio);
            this.estiloCorte = estiloCorte;
        }

        @Override
        void preparar() {
            System.out.println("Preparando pizza Nueva York: " + nombre);
        }

        @Override
        void hornear() {
            System.out.println("Horneando pizza Nueva York: " + nombre);
        }

        @Override
        void cortar() {
            System.out.println("Cortando pizza Nueva York: " + nombre + " con estilo de corte " + estiloCorte);
        }

        @Override
        void empacar() {
            System.out.println("Empacando pizza Nueva York: " + nombre);
        }
    }

    // Pizza Chicago
    class PizzaChicago extends pizzeria {
        private String grosorMasa;

        // Constructor
        public PizzaChicago(String nombre, String tamano, double precio, String grosorMasa) {
            super(nombre, tamano, precio);
            this.grosorMasa = grosorMasa;
        }

        @Override
        void preparar() {
            System.out.println("Preparando pizza Chicago: " + nombre);
        }

        void hornear() {
            System.out.println("Horneando pizza Chicago: " + nombre);
        }

        void cortar() {
            System.out.println("Cortando pizza Chicago: " + nombre + " con grosor de masa " + grosorMasa);
        }
        void empacar() {
            System.out.println("Empacando pizza Chicago: " + nombre);
        }
    }

    // Interfaz Ingrediente
    interface Ingrediente {
        String obtenerNombre();
        int obtenerCantidad();
    }

    // Implementación de ingredientes
    class Masa implements Ingrediente {
        private String tipo;
        private int cantidad;

        public Masa(String tipo, int cantidad) {
            this.tipo = tipo;
            this.cantidad = cantidad;
        }

        @Override
        public String obtenerNombre() {
            return tipo;
        }

        @Override
        public int obtenerCantidad() {
            return cantidad;
        }
    }

    class Salsa implements Ingrediente {
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

    class Queso implements Ingrediente {
        private String tipo;
        private int cantidad;

        public Queso(String tipo, int cantidad) {
            this.tipo = tipo;
            this.cantidad = cantidad;
        }

        @Override
        public String obtenerNombre() {
            return tipo;
        }

        @Override
        public int obtenerCantidad() {
            return cantidad;
        }
    }

    // Clase Sucursal
    class Sucursal {
        private String nombre;
        private String direccion;

        public Sucursal(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }

        public void agregarEmpleado(Empleado empleado) {
            // lógica para agregar empleado
            System.out.println("Empleado " + empleado.nombre + " agregado a la sucursal " + nombre);
        }

        public void agregarIngrediente(Ingrediente ingrediente) {
            // lógica para agregar ingrediente
            System.out.println("Ingrediente " + ingrediente.obtenerNombre() + " agregado a la sucursal " + nombre);
        }

        public void agregarEquipo(Equipo equipo) {
            // lógica para agregar equipo
            System.out.println("Equipo " + equipo.tipo + " agregado a la sucursal " + nombre);
        }

        public void agregarEspecialidad(pizzeria pizza) {
            // lógica para agregar especialidad
            System.out.println("Pizza " + pizza.nombre + " agregada a la sucursal " + nombre);
        }
    }

    // Clase Empleado
    class Empleado {
        public String nombre;
        private String puesto;
        private double salario;

        public Empleado(String nombre, String puesto, double salario) {
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = salario;
        }

        public void trabajar() {
            System.out.println(nombre + " está trabajando.");
        }

        public void tomarOrden() {
            System.out.println(nombre + " está tomando una orden.");
        }
    }

    // Clase Equipo
    class Equipo {
        public String tipo;
        private String estado;

        public Equipo(String tipo, String estado) {
            this.tipo = tipo;
            this.estado = estado;
        }

        public void encender() {
            estado = "encendido";
            System.out.println("Equipo " + tipo + " encendido.");
        }

        public void apagar() {
            estado = "apagado";
            System.out.println("Equipo " + tipo + " apagado.");
        }

        public void reparar() {
            System.out.println("Equipo " + tipo + " es reparado.");
        }
    }

    // Clase principal para ejecutar la aplicación
    public class main {
        public static void main(String[] args) {
            // Crear ingredientes
            Masa masa = new Masa("Masa fina", 1);
            Salsa salsa = new Salsa("Tomate", 1);
            Queso queso = new Queso("Mozzarella", 1);

            // Crear pizzas
            pizzeria pizzaNY = new pizzanewyork("Pizza Nueva York", "Grande", 12.99, "Corte en rebanadas");
            pizzeria pizzaChicago = new pizzachicago("Pizza Chicago", "Mediana", 14.99, "Corte en cuadraditos");

            // Crear sucursal
            Sucursal sucursal = new Sucursal("Sucursal Nueva York", "1st Avenue, NYC");

            // Agregar empleados
            Empleado empleado1 = new Empleado("José", "Cocinero", 2500);
            sucursal.agregarEmpleado(empleado1);

            // Agregar ingredientes
            sucursal.agregarIngrediente(masa);
            sucursal.agregarIngrediente(salsa);
            sucursal.agregarIngrediente(queso);

            // Crear equipos
            Equipo horno = new Equipo("Horno", "nuevo");
            sucursal.agregarEquipo(horno);

            // Agregar pizzas a la sucursal
            sucursal.agregarEspecialidad(pizzanewyork);
            sucursal.agregarEspecialidad(pizzaChicago);

            // Preparación y horneado
            pizzaNY.preparar();
            pizzaNY.hornear();
            pizzaNY.cortar();
            pizzaNY.empacar();

            pizzaChicago.preparar();
            pizzaChicago.hornear();
            pizzaChicago.cortar();
            pizzaChicago.empacar();
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}