public class Hexagon implements Polygon {
    private double d;


    public Hexagon(){
      d = 0;
    }
    public Hexagon(double e){
        d = e;
    }


    @Override
    public double area() {
        return ((3 * Math.sqrt(3) * (d * d)) / 2);
    }

    @Override
    public double perimeter() {
      return 6 * (d);

    }
}
