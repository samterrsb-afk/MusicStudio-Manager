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
        System.out.println("Añadida a playlist: " + song.getTitle() + " de " + song.getArtist());
    }

    public void playAll() {
        System.out.println("=== Reproduciendo Playlist: " + name + " ===");
        for (Song song : songs) {
            song.play();
        }
        System.out.println("=== Fin de Playlist ===\n");
    }

    public String getName() {
        return name;
    }
}
