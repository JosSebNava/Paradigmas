public class FiguraGeometrica{
    protected String nombre;

    // Contructor de la clase 
    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    // Metodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo que se describe en la clase derivada
    public void CalcularArea(){
        System.out.println("Metodo CalcularArea()");
    }
}