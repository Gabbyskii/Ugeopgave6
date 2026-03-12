package task1;

import java.util.ArrayList;

public class MediaPlayer {
    ArrayList<Playable> playlist;

    public MediaPlayer() {
        this.playlist = new ArrayList<>();
    }

    public void add(Playable item){
       playlist.add(item);
   }

    public void playAll(){
        for (Playable pl: playlist){
            pl.play();
        }
    }

    public int getTotalDurationSeconds() {
        int total = 0;
        for (Playable item: playlist) {
            total += item.getDurationSeconds();
        }
        return total;
    }

    public void printPlaylist(){
        for (Playable item: playlist) {
            System.out.println("Playlist: " + item.getTitle() +
                    " (" + item.getDurationSeconds() + " sek)");
        }
    }


}
