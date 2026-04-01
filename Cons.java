public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals

    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

    // [4, 2, 7].length() ==> 3
    // head: 4
    // tail: [2, 7]
    // this: [4, 2, 7]
    // expected result: 3
    public int length() {
        // must be recursive - Cons is recursive at the data level
        // [2, 7].length() ==> 2
        // rest: 2
        int rest = tail.length();
//        System.out.println("REST: " + rest + " :REST DONE");
        return rest + 1;
        // NEXT TIME: isEmpty, addAmount
    }

    public int sum() {
        return head+tail.sum();
    }
    // [].sum()
    // head plus the rest of the body gives you the sum

    public boolean contains(final int value) {
        return head==value || tail.contains(value);
    }
    // returns the value if it equals the head OR if its a value in the rest of the list. - Jerry

    public ImmutableList append(final ImmutableList other) {
        return new Cons(head, tail.append(other));
    }
    // changed return null to "return new Cons(head, tail.append(other))".
    // keeping the current head and making "other" to the tail and then making a new Cons
    //if tail == cons --> keep looping
    //if tail == nil --> return other


} // Cons