import java.util.*;
import java.io.*;

public class Jukebox1 {
  ArrayList<String> songList = new ArrayList<String>(); // We'll store the song titles in an ArrayList of Strings.

  public static void main(String[] args) {
    new Jukebox1().go();
  }

  // The method that starts loading the file and then prints the contens of the
  // songList ArrayList.
  public void go() {
    getSongs();
    System.out.println(songList);
    Collections.sort(songList); // Call the static Collections sort() method, then print the list again.
    // Collections.sort(songList);【This is where it breaks! It worked fine when
    // passed in an ArrayList<String>,
    // but as soon as we tried to sort an ArrayList<Song>, it failed】
    System.out.println(songList); // The second print out is in alphabetical order.
  }

  // Read the file and call the addSong() method for each line.
  void getSongs() {
    try {
      File file = new File("SongList.txt");
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = null;
      while ((line = reader.readLine()) != null) {
        addSong(line);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  // The addSong method works just like the Quiz-Card in the I/O chapter -- you
  // break the line (that has both the title and artist) into two pieces (tokens)
  // using the split() method.
  void addSong(String lineToParse) {
    String[] tokens = lineToParse.split("/");
    songList.add(tokens[0]);
  }

}

// 运行结果：
// [Pink Moon, Somersault, Shiva Moon, Circles, Deep Channel, Passenger, Listen]
// [Circles, Deep Channel, Listen, Passenger, Pink Moon, Shiva Moon, Somersault]