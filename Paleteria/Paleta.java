public class Paleta{
    protected String sabor;
    protected double precio;

    // Contructor de la clase 
     public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    // Metodos Get y Set
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodo que se describe en la clase derivada
    public void mostrarInformacion(){
        System.out.println("El sabor de la paleta es: " + sabor);
        System.out.println("El precio de la paleta es: $" + precio);
    }

    // Metodo para cambiar el precio de cada paleta
    public void cambiarPrecio(double nuevoPrecio){
        precio += nuevoPrecio;
        System.out.println("El nuevo precio de la paleta de " + sabor + " es de: $" + precio);
    }

    // Nueva funcionalidad que permite calcular y mostrar un descuento en el precio
    public void mostrarDescuento(){
        double descuento = precio * 0.1; // Aplica el 10% de descuento
        double paletaDescuento = precio - descuento;
        System.out.println("Precio de la paleta aplicando el descuento de 10% es de: $" + descuento);
        System.out.println("Nuevo precio con descuento: $" + paletaDescuento);
    }
}