package task1;

public class Podcast extends MediaItem implements Playable {
    String host;

    public Podcast(String title, int durationSeconds, String host) {
        super(title, durationSeconds);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("\uD83C\uDF99 Afspiller podcast: " + title +
                " af "+ host + " ("+ durationSeconds+ " sek)");
    }

}
