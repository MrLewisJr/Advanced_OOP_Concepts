public class Task {
    public static void main(String[] args){
        Car c1 = new Car("Kona",250);
        Car c2 = new Car("Ioniq",220);


        Racer raceCar1 = new Racer( c1 );
        Racer raceCar2 = new Racer( c2 );

        new Thread(raceCar1).start();
        new Thread(raceCar2).start();
        /* TODO Create a racer with c1 */
        /* TODO Create a Racer with c2*/
        /* TODO: Create two threads using "new Thread" and pass  one Runnable to each thread.  It is your job to figure out which are the Runnables.*/
    }
}