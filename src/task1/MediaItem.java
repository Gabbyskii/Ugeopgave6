package task1;

public abstract class MediaItem {

    protected String title;
    protected int durationSeconds;

    public MediaItem(String title, int durationSeconds) {
        this.title = title;
        this.durationSeconds = durationSeconds;
    }


    // implementeret interface metoder her istedet for i song,audibook&podcast
    public String getTitle() {
        return title;
    }


    public int getDurationSeconds() {
        return durationSeconds;
    }


    @Override
    public String toString() {
        return "Title: "+ title + ", Duration: "+ durationSeconds;
    }

}
