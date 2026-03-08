import java.util.ArrayList;

public class Opera extends MusicalShow {
    MusicAuthor musicAuthor;
    int choirSize;

    public Opera (String title, int duration, Director director,
                  String librettoText, MusicAuthor musicAuthor, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
