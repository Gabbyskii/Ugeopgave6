package task1;

import java.util.ArrayList;

public class Main {
    void main(){

     ArrayList<Playable> media = new ArrayList<>();
     media.add(new Audiobook("Little red riding hood", 2000,"greta"));
     media.add(new Song("Raindance", 300,"greta"));
     media.add(new Podcast("John kirikou interview",1500,"LADBible"));

     for (MediaPlayer m: media){
         System.out.println(m);
     }
        .printPlaylist();


    }

}
