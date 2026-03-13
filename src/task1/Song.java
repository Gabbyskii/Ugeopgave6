package task1;

public class Song extends MediaItem implements Playable {
     protected String artist;

    public Song(String title, int durationSeconds, String artist) {
        super(title, durationSeconds);
        this.artist = artist;
    }


    @Override
    public void play() {
        System.out.println("♪ Afspiller sang: "+ title +
                " af "+ artist + " ("+ durationSeconds+" sek)");
    }

    //ville ellers skulle kalde inferface metoder her ved: return super.getDuration; fx



}
