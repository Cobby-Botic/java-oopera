public class Director extends Person {
    private int numberOfShows = 0;

public Director(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}
