import java.util.*;
import java.io.*;

public class Jukebox3 {
  // Change to an ArrayList of Song objects instead of String.
  ArrayList<Song> songList = new ArrayList<Song>();

  public static void main(String[] args) {
    new Jukebox3().go();
  }

  public void go() {
    getSongs(); // We didn't change getSongs(), so it still puts the songs in an ArrayList
    System.out.println(songList);
    Collections.sort(songList);
    System.out.println(songList);

    // Instantiate a TreeSet instead of HashSet. Calling the no-arg TreeSet
    // constructor means the set will use the Song object's compareTo() method for
    // the sort. (We could have passed in a Comparator.)
    TreeSet<Song> songSet = new TreeSet<Song>();
    // We can add all the songs from the HashSet using addAll(). (Or we could have
    // added the songs individually using songSet.add() just the way we added songs
    // to the ArrayList.)
    songSet.addAll(songList);
    System.out.println(songSet);
  }

  void getSongs() {
    try {
      File file = new File("SongListMore.txt");
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = null;
      while ((line = reader.readLine()) != null) {
        addSong(line);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  void addSong(String lineToParse) {
    String[] tokens = lineToParse.split("/");
    // Create a new Song object using the four tokens (which means the four pieces
    // of info in the song file for this line), then add the Song object to the
    // list.
    Song song = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
    songList.add(song);
  }

}

// Usually these match(the two 'Song's in the following line)... we are
// specifying the type that the implementing class can be compared against. This
// means that Song objects can be compared to other Song objects, for the
// purpose of sorting.
class Song implements Comparable<Song> {

  // The sort() method sends a Song to compareTo() to see how that Song compares
  // to the Song on which the method was invoked.
  public int compareTo(Song s) {
    return title.compareTo(s.getTitle()); // We just pass the work on to the title String objects, since we know Strings
                                          // have a compareTo() method.
  }

  // Four instance varibles for the four song attributes in the file.
  String title;
  String artist;
  String rating;
  String bpm;

  // The HashSet (or anyone else calling this method) sends it another Song.
  public boolean equals(Object aSong) {
    Song s = (Song) aSong;
    // The GREAT news is that title is a String, and Strings have an overridden
    // equals() method. So all we have to do is ask one title if it’s equal to the
    // other song’s title.
    return getTitle().equals(s.getTitle());
  }

  public int hashCode() {
    // Same deal here... the String class has an overridden hashCode() method, so
    // you can just return the result of calling hashCode() on the title. Notice how
    // hashCode() and equals() are using the SAME instance variable.
    return title.hashCode();
  }

  // The varibles are all set in the constructor when the new Song is created.
  Song(String t, String a, String r, String b) {
    title = t;
    artist = a;
    rating = r;
    bpm = b;
  }

  // The getter methods for the four attributes.
  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public String getRating() {
    return rating;
  }

  public String getBpm() {
    return bpm;
  }

  // We ovverride toString(), because when you do a
  // System.out.println(aSongObject), we want to see the title. When you do a
  // System.out.println(aListOfSongs), it calls the toString() method of EACH
  // element in the list.
  public String toString() {
    return title;
  }
}

// 运行结果
// display by title without soring
// [Pink Moon, Somersault, Listen, Shiva Moon, Circles, Deep Channel, Listen,
// Passenger, Listen, Circles, Listen]
// display by title with soring and duplicates
// [Circles, Circles, Deep Channel, Listen, Listen, Listen, Listen, Passenger,
// Pink Moon, Shiva Moon, Somersault]
// display by title with soring and no duplicates
// [Circles, Deep Channel, Listen, Passenger, Pink Moon, Shiva Moon, Somersault]