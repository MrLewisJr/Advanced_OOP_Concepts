class Square extends Shape {
    double length;

    public Square(double length, String name ) {
        super(name);
        this.length = length;
    }

    @Override
    public double getArea(){
        return length * length;
    }

    @Override
    public double getPerimeter(){
        return 4 * length;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( obj instanceof Square)
            return length == ((Square)obj).length && name.equals( ((Square)obj).name );
        else
            return false;
    }

    @Override
    public String toString() {
        return name + ":" + length;
    }
}