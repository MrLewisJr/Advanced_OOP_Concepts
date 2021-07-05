import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};

    /* TODO
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/
    public Deck() {
        this.deck = new ArrayList<>();
        String[] faceValue = { "Ace","Jack","Queen","King"};
        Integer[] numberValue = {2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < suits.length; i++ ) {
            for (int j = 0; j < numberValue.length; j++ ) {
                this.deck.add( new Card( numberValue[j], suits[i] ) );
            }

            for (int j = 0; j < faceValue.length; j++ ) {
                this.deck.add( new Card( faceValue[j], suits[i] ) );
            }
        }
    }
    /* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */

    public Card dealCard() {
        int ran = (int)( Math.random() * this.deck.size() );
        //Card temp = deck.get( ran );
        //deck.remove( ran );
        //return temp;
        return this.deck.remove( ran );
        }

    public int size(){
        return deck.size();
    }
    /* TODO
Return a new DeckIterator with this instance in the constructor.*/
    @Override
    public Iterator<Card> iterator() {
           return new DeckIterator( this );
       }
}
