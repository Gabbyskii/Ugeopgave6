package task1;

import java.util.ArrayList;

public class Main {
    void main(){

        MediaPlayer player = new MediaPlayer();

        player.add(new Audiobook("Little red riding hood", 2000,"greta"));
        player.add(new Song("Raindance", 300,"greta"));
        player.add(new Podcast("John kirikou interview",1500,"LADBible"));

        System.out.println("===Playlist===");
         player.printPlaylist();

        System.out.println("\n===Afspilning af playlist===");
        player.playAll();

        System.out.println("Playlist samlet varighed: "
                + player.getTotalDurationSeconds() + " sek");



    }

}

