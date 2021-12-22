public class Pentagon implements Polygon {
    private double d;


 public Pentagon() { //constructor
  d = 0;
 }

 public Pentagon(double e){
     d = e;
 }





    @Override
    public double area() {
        return (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * d * d) / 4;
    }

    @Override
    public double perimeter() {
        return 5 * d;
    }
}
