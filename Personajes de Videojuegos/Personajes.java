public class Personajes{
    protected String nombre;
    protected int nivel;

    // Contructor de la clase 
    public Personajes(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Metodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    // Metodo que se describe en la clase derivada
    public void atacar(){
        System.out.println(nombre + " realiza un ataque");
    }
}