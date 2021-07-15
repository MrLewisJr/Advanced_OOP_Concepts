 /* TODO This class is exactly as the Racer from Task 1*/

 public class Racer implements Runnable {
     Car c;
     int distance = 1000; // this is a racer that is going to run 1000 miles.

     public Racer( Car c ) {
         this.c = c;
     }

     @Override
     public void run() {
         while ( this.c.odometer < this.distance ){
             if (this.c.miles > 0 ) {
                 this.c.move(1);
             }
             else {
                 this.c.charge();
                 System.out.println("Charging: " + c.name );
                 try {
                     Thread.sleep( (long) c.maxMiles );
                 }
                 catch ( InterruptedException e) {
                     System.out.println("STOP");
                 }
             }
         }
     }
 }