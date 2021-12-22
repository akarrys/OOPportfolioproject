public class Square implements Polygon {
   private double d;


   public Square(){
    d = 0;
  }

  public Square(double e){
       d = e;
  }




    @Override
    public double area() {
        return (d * d);
    }

    @Override
    public double perimeter() {
        return 4 * (d);

    }
}
