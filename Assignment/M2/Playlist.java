package assignment.m2;

import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int maxSongs) {
        if (maxSongs < 0) {
            throw new IllegalArgumentException("Maximum songs cannot be negative.");
        }
        songs = new String[maxSongs];
        songCount = 0;
    }

    public boolean addSong(String title) {
        if (title == null || songCount == songs.length) {
            return false;
        }
        songs[songCount] = title;
        songCount++;
        return true;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println("Playlist songs: " + Arrays.toString(p.getSongs()));
        System.out.println("Song count: " + p.getSongCount());
    }
}
