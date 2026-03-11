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
        //play();
    }

    public int getTotalDurationSeconds() {
        return 0;
    }

    public void printPlaylist(){

    }

}
