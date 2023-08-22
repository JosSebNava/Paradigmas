public class Enemigo extends Personajes{
    private String tipo;

    // Constructor de la clase derivada
    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    // Metodos Get y Set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Se sobrescribe el metodo gritar para mostrar que dira el enemigo
    public void gritar(){
        System.out.println(nombre + " emite un grito muy escalofriante");
    }
}
