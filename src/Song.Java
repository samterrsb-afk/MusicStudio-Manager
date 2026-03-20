public class Song {
    private String title;
    private String artist;
    private int duration; // duración en segundos

    // Constructor
    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDuration() { return duration; }

    // Método para mostrar info de la canción
    public void showInfo() {
        System.out.println("Canción: " + title + " | Artista: " + artist + " | Duración: " + duration + "s");
    }
}
