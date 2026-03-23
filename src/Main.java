public class Main {
    public static void main(String[] args) {
        // ---SECCIÓN DE INSTRUMENTOS ---
        Instrumento miGuitarra = new Instrumento();
        miGuitarra.nombre = "Fender Stratocaster";
        miGuitarra.tipo = "Cuerda";
        miGuitarra.precio = 1250;
        miGuitarra.sonar();

// --- SECCIÓN DE CANCIONES (¡Lo nuevo!) ---
        // 1. Fabricamos la canción usando el plano 'Song'
        Song miCancion = new Song();

        // 2. Le ponemos sus etiquetas (Atributos)
        miCancion.titulo = "Let it Be";
        miCancion.artista = "The Beatles";
        miCancion.duracionSegundos = 240;

        // 3. ¡Le damos al Play! (Método)
        miCancion.reproducir();

        // 1. Fabricamos la segunda canción usando el plano 'Song'
        Song otraCancion = new Song();

        // 2. Le ponemos sus etiquetas (Atributos)
        otraCancion.titulo = "Chipirones";
        otraCancion.artista = "Paquito el metrallero";
        otraCancion.duracionSegundos = 600;

        // 3. ¡Le damos al Play! (Método)
        otraCancion.reproducir();

// 1. Creamos el álbum (Playlist)
Playlist miLista = new Playlist("Favoritos de Samuel");

// 2. Metemos nuestra canción en el álbum
miLista.addSong(miCancion);

// 3. ¡Añade una segunda canción tú solo!
// Pista: Crea una nueva Song (ej: otraCancion), dale título y artista, 
// y usa miLista.addSong(otraCancion);
miLista.addSong(otraCancion);

// 4. Dale al Play a todo el álbum
miLista.playAll();
// Le pedimos a la lista que nos diga el tiempo total
miLista.mostrarDuracionTotal();

miLista.filtrarCancionesCortas();
// Solo queremos escuchar a los Beatles
miLista.filtrarPorArtista("The Beatles");
    }
}