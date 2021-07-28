import java.time.LocalDate;
import java.time.Period;

class Person {
    private String name;
    private LocalDate birthDate;

    private class Position {
        protected String name;
        protected double salary;
        private Position( String title, double salary){
            this.name = title;
            this.salary = salary;
        }
        @Override
        public String toString() {
            return this.name+":"+this.salary;
        }
    }

    private Position position;

    public Person(String name, String birthDate ) {
        this.name = name;
        this.birthDate = LocalDate.parse( birthDate );
    }

    int getAge() {
        Period years = Period.between( this.birthDate, LocalDate.now() );
        return years.getYears();
    }

    void setPosition( String title, double salary ){
        this.position = new Position( title, salary);
    }

    Position getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return this.name+":"+this.getAge()+":"+this.position.toString();
    }
}
