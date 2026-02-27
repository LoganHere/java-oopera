public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", рост: " + height + " см";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Actor)) return false;

        Actor actor = (Actor) obj;
        return height == actor.height;
    }
}
