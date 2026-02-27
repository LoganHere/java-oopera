public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirectorNameSurname() {
        System.out.println("Режиссёр: " + name + " " + surname);
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return super.toString() + ", поставил " + numberOfShows + " шоу";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Director)) return false;

        Director director = (Director) obj;
        return numberOfShows == director.numberOfShows;
    }
}
