public class Instrumento {
    //Estas son las caracteristicas (atributos)
    String nombre;
    String tipo;
    int precio;

    //Esto es lo que sabe hacer (metodo)
    public void sonar() { 
        System.out.println("¡El instrumento " + nombre + " está sonando!");

        // Un pequeño detalle de calidad
        if (precio > 1000) {
            System.out.println("Nota del Mentor: ¡Suena como un equipo de lujo!");
        }
    }
}