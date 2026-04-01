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
            final Cons otherCons = (Cons) other;
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
} // Cons


// ----------- new code ------------
// @Override
// public int length() { return 1 + tail.length(); }

// @Override
// public int sum() { return head + tail.sum(); }

// @Override
// public boolean contains(int value) { return head == value ||
// tail.contains(value); }

// @Override
// public ImmutableList append(ImmutableList other) { return new Cons(head,
// tail.append(other)); }
