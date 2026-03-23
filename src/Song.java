public class Song {
    // Estas son las "etiquetas" de nuestra canción favorita (Atributos)
    String titulo;
    String artista;
    int duracionSegundos;

    // Esto es lo que la canción saber hacer (Método)
    public void reproducir(){
        System.out.println("Reproduciendo: " +titulo + " de " + artista);
    
    }
}