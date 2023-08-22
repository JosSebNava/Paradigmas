public class PaletaAgua extends Paleta {
    private boolean baseAgua;
    private static int ventasAgua = 0;

    // Constructor de la clase derivada
    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    // Metodos Get y Set
    public boolean tieneBaseAgua() {
        return baseAgua;
    }

    public void setBaseAgua(boolean baseAgua) {
        this.baseAgua = baseAgua;
    }

    public static int getVentasAgua() {
        return ventasAgua;
    }

    public static void setVentasAgua(int ventasAgua) {
        PaletaAgua.ventasAgua = ventasAgua;
    }

    public void realizarVenta() {
        ventasAgua++;
    }

    // Se sobrescribe el metodo para saber si la paleta es a base de agua o no
    public void mostrarBaseAgua() {
        System.out.println("La paleta es a base de agua: " + baseAgua);
    }

    // Salida que permite ver el total de las ventas de paletas de agua
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Total de ventas de paletas de agua: " + ventasAgua);
    }
}