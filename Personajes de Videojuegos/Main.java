public class Main {
    public static void main(String[] args) {

        // Crear instancias de las clases derivadas y llamar el metodo atacar(), usarHabilidadEspecial y gritar().
        Jugador J1 = new Jugador("Adam", 65, "Cazador de tesoros");
        Enemigo E2 = new Enemigo("Bahamut", 90, "Dragon");

        J1.atacar();
        J1.usarHabilidadEspecial();

        E2.atacar();
        E2.gritar();
    } 
}