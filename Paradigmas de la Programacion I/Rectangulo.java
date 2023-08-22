public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    // Constructor de la clase derivada
     public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

     // Metodos Get y Set
       public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Se sobrescribe el metodo CalcularArea para saber el area del rectangulo
    @ Override
    public void CalcularArea(){
        double area =  base * altura;
        System.out.println("Area del rectangulo: " + nombre + ": " + area);
    }
}