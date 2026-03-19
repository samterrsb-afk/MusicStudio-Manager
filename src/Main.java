public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA ---");
        System.out.println("Proyecto: MusicStudio-Manager v1.0");
        System.out.println("Memoria asignada: 64GB");
        System.out.println("-------------------------");

        // Crear canciones
        Song song1 = new Song("Thunderstruck", "AC/DC", 292);
        Song song2 = new Song("Shape of You", "Ed Sheeran", 233);
        Song song3 = new Song("Blinding Lights", "The Weeknd", 200);

        // Crear playlist
        Playlist playlist = new Playlist("Mi Playlist Favorita");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        // Reproducir playlist
        playlist.playAll();
    }
}
