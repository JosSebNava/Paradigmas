public class PaletaCrema extends Paleta {
    private boolean cremosa;
    private static int ventasCrema = 0;

    // Constructor de la clase derivada
    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }

    // Metodos Get y Set
    public boolean esCremosa() {
        return cremosa;
    }

    public void setCremosa(boolean cremosa) {
        this.cremosa = cremosa;
    }

    public static int getVentasCrema() {
        return ventasCrema;
    }
    
    public static void setVentasCrema(int ventasCrema) {
        PaletaCrema.ventasCrema = ventasCrema;
    }

    // Se sobrescribe el metodo para saber si la paleta es a base de crema o no
    public void mostrarTexturaCremosa() {
        System.out.println("La paleta es a base de crema: " + cremosa);
    }

    // Salida que permite ver el total de las ventas de paletas de crema
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Total de ventas de paletas de crema: " + ventasCrema);
    }

    public void realizarVenta() {
        ventasCrema++;
    }
}