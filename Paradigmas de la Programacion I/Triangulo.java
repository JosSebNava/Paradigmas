public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    
    // Constructor de la clase derivada
      public Triangulo(String nombre, double base, double altura) {
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

    // Se sobrescribe el metodo CalcularArea para saber el area del triangulo
    @ Override
    public void CalcularArea(){
       double area =  (base * altura) / 2;
       System.out.println("Area del triangulo: " + nombre + ": " + area);
    }
}