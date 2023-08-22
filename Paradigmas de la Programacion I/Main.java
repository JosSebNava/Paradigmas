public class Main {
    public static void main(String[] args) {

        // Crear instancias de las clases derivadas y llamar CalcularArea
        Circulo C1 =  new Circulo("Circulo", 9);
        Rectangulo R2 = new Rectangulo("Rectangulo", 9, 7);
        Triangulo T3 = new Triangulo("Triangulo", 4, 7);

        FiguraGeometrica[] f = {C1, R2, T3};
        for(FiguraGeometrica figura : f){
            figura.CalcularArea();
        }
    } 
}