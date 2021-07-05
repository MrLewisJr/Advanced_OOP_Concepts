/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/

public class BingoChip<T,G> {
    T varOne;
    G varTwo;

    BingoChip( T varOne, G varTwo ){
        this.varOne = varOne;
        this.varTwo = varTwo;
    }

    @Override
    public String toString() {
        final String s = "Chip: " + this.varOne + "-" + this.varTwo;
        return s;
    }
}
