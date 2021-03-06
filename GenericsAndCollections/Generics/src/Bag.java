import java.util.ArrayList;

public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){
        /* TODO 
Initialize the objects variable*/
        this.objects = new ArrayList<>();
    }
    /* TODO 
code the add method described. It should be public and not 
return anything. Just take in a parameter and  throw an 
exception. Read the documentation for this.*/
    public void add(T obj) throws BagException {
        if ( obj == null) {
            throw new BagException("Cannot add null to a Bag");
        }
        else
            this.objects.add( obj );
    }

 /* TODO 
Code the drawOne method here. It should not take any
parameters. It should return a generic object. More on the
task description.*/

    public T drawOne() {
        return objects.get( (int)( Math.random() * objects.size() ) );
    }


/* TODO
howMany is the number of elements to draw. 
Create an ArrayList of the generic type and "drawOne" as
many times as you need, putting the element drawn in the ArrayList.
Then return it. */
   public ArrayList<T> drawMany(int howMany) {
       ArrayList<T> drawn = new ArrayList<>();
       for( int i = 0; i < howMany; i++ ) {
           drawn.add( drawOne() );
       }
       return drawn;
    }

    public void add(T element,double prob) throws BagException{
        /* TODO 
Check that the probability is between 0 and 1. Otherwise
throw an exception. */        // This is a way to add elements in a given proportion.
        if ( element == null)
            throw new BagException("Cannot add null to a Bag");
        else if ( prob < 0.0 || prob > 1.0 )
            throw new BagException("Probability should be between 0 and 1");

        int tot = (int)Math.round(objects.size()*prob);
        for(int i=0;i<tot;i++){
            System.out.println("Adding "+i);
            objects.add(element);
        }
    }
}
