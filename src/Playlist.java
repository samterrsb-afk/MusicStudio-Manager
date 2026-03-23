import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Añadida a playlist: " + song.titulo + " de " + song.artista);
    }

    public void playAll() {
        System.out.println("🎸🎸🎸 Reproduciendo Playlist: " + name + " 🎸🎸🎸");
        for (Song song : songs) {
            song.reproducir();
        }
        System.out.println("=== Fin de Playlist ===\n");
    }

    public String getName() {
        return name;
    }
    // ... aquí estarían tus otros métodos (addSong, playAll, mostrarDuracionTotal)

    public void mostrarDuracionTotal() {
        int huchaDeSegundos = 0;
        for (Song s : songs) {
            huchaDeSegundos = huchaDeSegundos + s.duracionSegundos;
        }
        System.out.println("⏱️ Duración total del álbum: " + huchaDeSegundos + " segundos.");
    } // <--- Esta llave SOLO cierra el método de la duración

// ... (aquí estarían tus otros métodos: addSong, playAll, mostrarDuracionTotal)

    public void filtrarCancionesCortas() {
        System.out.println("--- Filtrando canciones de menos de 5 minutos ---");
        for (Song s : songs) {
            if (s.duracionSegundos < 300) {
                s.reproducir();
            }
        }
    } // <-- Cierra el filtro de tiempo

    public void filtrarPorArtista(String artistaBuscado) {
        System.out.println("🔍 Buscando canciones de: " + artistaBuscado);
        for (Song s : songs) {
            if (s.artista.equals(artistaBuscado)) {
                s.reproducir();
            }
        }
    } // <-- Cierra el filtro de artista

} // <--- LLAVE MAESTRA: Cierra la clase Playlist (EL EDIFICIO)