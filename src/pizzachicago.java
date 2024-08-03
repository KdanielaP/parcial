public class pizzachicago {
    class Pizzeria extends pizzeria {
    private String grosorMasa;

    public Pizzeria(String nombre, String tamano, double precio, String grosorMasa) {
        super(nombre, tamano, precio);
        this.grosorMasa = grosorMasa;
    }
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

}
