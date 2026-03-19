public class Song {
    private String title;
    private String artist;
    private int duration; // en segundos

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Reproduciendo: " + title + " de " + artist + " [" + duration + "s]");
    }

    // Getters y setters (opcional)
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDuration() { return duration; }
}
