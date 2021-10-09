package day48_Satatic;

import com.sun.org.apache.xerces.internal.xs.StringList;
import javafx.animation.PauseTransition;

public class Song {

    int name;
    String length;
    String author;
    String publisher;
    String genre;

    public Song(int name){
        this.name=name;

    }
    public Song(String name,String length){
        this(5);
        this.length=length;

    }
    public Song(String name,String length, String author){
        this(name,length);
        this.author=author;
    }
    public Song(String name, String length, String author, String publisher){
        this(name, length,author);
        this.publisher=publisher;

    }
    public Song(String name, String length, String author, String publisher,String genre){
        this(name, length, author, publisher);
        this.genre=genre;
    }




}
