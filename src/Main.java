public class Main {
    public static void main(String[] args) {
        // Creamos una "instancia" (un objeto real)
        Instrumento miGuitarra = new Instrumento();
        
        // Le asignamos sus valores
        miGuitarra.nombre = "Fender Stratocaster";
        miGuitarra.tipo = "Cuerda";
        miGuitarra.precio = 1250;

        // Ejecutamos su acción
        miGuitarra.sonar();
    }
}