import java.util.HashMap;
import java.util.Set;

public class Counter<E> {

    /* TODO The HashMap should accomodate a generic class for the keys and Integer for the value*/

    private HashMap<E,Integer> counts;


    /* TODO Loop through the elements of "things" and use the HashMap "counts" to store the elements of
        things as keys, and the number of times they appear in the array as values. Check the instructions. */

    public Counter(E[] things){
        counts = new HashMap< E , Integer >();
        counts.put(things[0],new Integer(1) );

        for (int i = 1; i < things.length; i++ ) {
            if ( counts.containsKey( things[i]) ) {
                Integer temp = (Integer) counts.get(things[i]);
                counts.put( things[i], temp.intValue() + 1 );
            }
            else {
                counts.put( things[i], new Integer( 1 ) );
            }
        }
    }

      /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */

        public Integer getCount(E element){
            return (Integer) counts.get( element );
        }

    public int getSize(){
        return this.counts.size();
    }

/* TODO
Returns the most frequent key in the HashMap*/
    public E mostFrequent() {
        E temp = null;
        int maxFreq = 0;
        for( Object element : counts.keySet() ) {
            if ( maxFreq < (Integer) counts.get( (E) element ) ) {
                    maxFreq = (Integer) counts.get( (E) element );
                    temp = (E) element;
            }
        }
        return temp;
        }
    }
