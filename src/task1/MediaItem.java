package task1;

public abstract class MediaItem {

    String title;
    int durationSeconds;

    public MediaItem(String title, int durationSeconds) {
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }


    @Override
    public String toString() {
        return "Title: "+ title + ", Duration: "+ durationSeconds;
    }

}
