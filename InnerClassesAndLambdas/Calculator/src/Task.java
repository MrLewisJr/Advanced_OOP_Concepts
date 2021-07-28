import java.util.ArrayList;
import java.util.List;

public class Task {
/* TODO */
    public static class Triplet<E1,E2,E3>{
        public E1 firstTrip;
        public E2 secondTrip;
        public E3 thirdTrip;
        public Triplet(E1 firstTrip, E2 secondTrip, E3 thirdTrip) {
            this.firstTrip = firstTrip;
            this.secondTrip = secondTrip;
            this.thirdTrip = thirdTrip;
        }
    }
    public static String result;
    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>();
        t.add(new Triplet<>(3.4,5.2,"+"));
        t.add(new Triplet<>(2.3,1.23,"-"));
/* TODO */
        t.add(new Triplet<>(4.5,5.4,"*"));
        t.add(new Triplet<>(6.2,0.0,"/"));
        t.add(new Triplet<>(56.0,28.0,"/"));


        t.forEach((Triplet) -> result += c.compute(Triplet.firstTrip, Triplet.secondTrip, Triplet.thirdTrip) );

        /* TODO */
        System.out.println(result);
    }
}