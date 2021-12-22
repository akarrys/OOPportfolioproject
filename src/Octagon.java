public class Octagon implements Polygon{
    private double d;

    public Octagon(){
        d = 0;

    }

    public Octagon(double e){
        d = e;
    }








    @Override
    public double area() {
       d =  (double)(2 * (1 + Math.sqrt(2)) * d * d);
        return d;
    }

    @Override
    public double perimeter() {
        return 8 * d;
    }
}
