public class Quadrilateral implements Polygon {
    protected double area;
    protected double sideone;
    protected double sidetwo;
    protected double sidethree;
    protected double sidefour;
    protected double semiperimeter;

    public  Quadrilateral(double a, double sone, double stwo, double sthree, double sfour, double semiperm){ //constuctor
        a = area;
        sone = sideone;
        stwo = sidetwo;
        sthree  = sidethree;
        sfour = sidefour;
        semiperm = semiperimeter;

    }







    @Override
    public double area() {
        semiperimeter = (sideone + sidetwo + sidethree + sidefour) / 2;
         area = Math.sqrt((semiperimeter - sideone) *
                (semiperimeter - sidetwo) *
                (semiperimeter - sidethree) *
                (semiperimeter - sidefour));
                return area;
    }

    @Override
    public double perimeter() {
        semiperimeter = (sideone + sidetwo + sidethree + sidefour) / 2;
        return semiperimeter;
    }
}
