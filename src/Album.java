import java.util.List;

public class Album {


    private String name;
    private List<String> songs;


    public Album(String name, List<String> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
    public void printTrackListings(){
        System.out.println(name.toUpperCase() + " track listing...");
        for (int i = 0; i < songs.size(); i += 1) {
        System.out.println((i + 1) + ". " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist());

    }

}
}
