import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, String director, ArrayList<Actor> listOfActors, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
}
