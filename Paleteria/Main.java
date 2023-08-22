public class Main {
    public static void main(String[] args) {
        
    // Crear instancias de PaletaAgua y PaletaCrema
    PaletaAgua paletaAgua = new PaletaAgua("Limon", 22.0, true);
    paletaAgua.mostrarInformacion();
    paletaAgua.mostrarBaseAgua();
    paletaAgua.realizarVenta();
    paletaAgua.mostrarDescuento();
    System.out.println("=====================================================================");
    paletaAgua.cambiarPrecio(2.0);
    paletaAgua.mostrarInformacion();
    paletaAgua.realizarVenta();
    paletaAgua.mostrarDescuento();
 
    System.out.println();

    PaletaCrema paletaCrema = new PaletaCrema("Fresa", 33.0, true);
    paletaCrema.mostrarInformacion();
    paletaCrema.mostrarTexturaCremosa();
    paletaCrema.realizarVenta();
    paletaCrema.mostrarDescuento();
    System.out.println("=====================================================================");
    paletaCrema.cambiarPrecio(6.0);
    paletaCrema.mostrarInformacion();
    paletaCrema.realizarVenta();
    paletaCrema.mostrarDescuento();
    
    }
}