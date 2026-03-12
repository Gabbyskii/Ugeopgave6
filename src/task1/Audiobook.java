package task1;

public class Audiobook extends MediaItem implements Playable {
    String author;

    public Audiobook(String title, int durationSeconds, String author) {
        super(title, durationSeconds);
        this.author = author;
    }


    @Override
    public void play() {
        System.out.println("\uD83D\uDCD6 Afspiller lydbog: " + title +
                " af "+ author + " ("+ durationSeconds+" sek)");
    }

}
