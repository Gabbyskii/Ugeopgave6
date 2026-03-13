package task1;

import java.util.ArrayList;

public class Main {
    void main(){

        MediaPlayer player = new MediaPlayer();

        player.add(new Audiobook("Little red riding hood", 2000,"Charles"));
        player.add(new Song("Raindance", 300,"Tems"));
        player.add(new Podcast("John kirikou interview",1500,"LADBible"));
        player.add(new Podcast("Rotten mango",2500,"Stephanie So"));

        System.out.println("===Playlist===");
         player.printPlaylist();

        System.out.println("\n===Afspilning af playlist===");
        player.playAll();

        System.out.println("\nPlaylist samlet varighed: "
                + player.getTotalDurationSeconds() + " sek");


        /* varibler:
        Playable song = new Song("test",230,"tester");
        Playable song1 = song;
        System.out.println(song1);*/



    }

}

