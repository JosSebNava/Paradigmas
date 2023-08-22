public class Circulo extends FiguraGeometrica {
    private double radio;

    // Constructor de la clase derivada
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Metodos Get y Set
     public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Se sobrescribe el metodo CalcularArea para saber el area del circulo
    @ Override
    public void CalcularArea() {
        double area =  Math.PI * radio * radio;
        System.out.println("Area del circulo: " + nombre + ": " + area);
    }
}