public class Rectangle implements Polygon{
   private double sideone;
   private double sidetwo;





    public Rectangle(){
       sideone = 0;
       sidetwo = 0;
    }

    public Rectangle(double d, double e){
        sideone = d;
        sidetwo = e;
    }






    @Override
    public double area() {
        return sideone * sidetwo;
    }

    @Override
    public double perimeter() {
        return (sideone + sidetwo) * 2;
    }
}

