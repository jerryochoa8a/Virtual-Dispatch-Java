public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals

    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode

    public int length() {
        return 0;
    }

    public int sum() {
        return 0;
    }//changed from -1 to 0

    public boolean contains(final int value) {
        return false;
    }
    // return false insted of true becouse it would return false after reaching
    // the end of the list meaning the value was not found. -jerry

    public ImmutableList append(final ImmutableList other) {return other;}
    //Changed return null to return other. appending to an empty list should just return the other list - Jerry

} // Nil