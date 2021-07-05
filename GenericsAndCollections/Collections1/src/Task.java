import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));

        /* TODO Compete a for loop that prints every card in the deck d */
        for( Card card: d ) {
            System.out.println( card );
        }
    }


 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/

        public static int addCards(ArrayList<Card> hand){
            int sum = 0;
            for ( int i = 0; i < hand.size(); i++ ) {
                if ( ( hand.get(i).getValue() + "" ).equals("Ace") )
                    sum += 1;
                else if ( ( hand.get(i).getValue() + "" ).equals("Jack") )
                    sum += 11;
                else if ( ( hand.get(i).getValue() + "" ).equals("Queen") )
                    sum += 12;
                else if ( ( hand.get(i).getValue() + "" ).equals("King") )
                    sum += 13;
                else
                    sum = sum + Integer.parseInt( hand.get(i).getValue().toString() );
        }
        return sum;
    }
}