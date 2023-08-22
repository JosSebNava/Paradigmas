public class Jugador extends Personajes{
    private String clase;

    // Constructor de la clase derivada
    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }

    // Metodos Get y Set
     public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    // Se sobrescribe el metodo usarHabilidadEspecial  para mostrar que habilidad ocupa el jugador
    public void usarHabilidadEspecial(){
        System.out.println(nombre + " ocupa una habilidad especial");
    }
}