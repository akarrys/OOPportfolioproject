/*
Author: Akarrys
Description: Small OOP portfolio project, program allows users to create polygons of various
types and input their geometric dimensions and output their area and perimeter.
Date: Dec 22 2021
*/

import java.util.Scanner;
public class Tester {
    public static void main (String[]args){ //main start of program
        Scanner keyboard = new Scanner(System.in);
        double d = 0;
        double e = 0;
        double f = 0;

        System.out.println("Enter the three sides of the Triangle: ");
        d = keyboard.nextDouble();
        e = keyboard.nextDouble();
        f = keyboard.nextDouble();

        Triangle triangle = new Triangle(d,e,f);
        System.out.println("The area of the triangle is: " + triangle.area());
        System.out.println("The perimeter of the triangle is: " + triangle.perimeter());

        System.out.println("Enter the two sides of the Isosceles Triangle: ");
        d = keyboard.nextDouble();
        e  = keyboard.nextDouble();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(d,e);
        System.out.println("The area of the Isosceles Triangle is: " + isoscelesTriangle.area());
        System.out.println("The perimeter of the Isosceles Triangle is: " + isoscelesTriangle.perimeter());

        System.out.println("Enter the side of the Square: ");
        d = keyboard.nextDouble();
        Square square = new Square(d);
        System.out.println("The area of the Square is: " + square.area());
        System.out.println("The perimeter of the Square is: " + square.perimeter());

        System.out.println("Enter the side of the Pentagon");
        d = keyboard.nextDouble();

        Pentagon pentagon = new Pentagon(d);
        System.out.println("The area of the Pentagon  is: " + pentagon.area());
        System.out.println("The perimeter of the Pentagon is: " + pentagon.perimeter());

        System.out.println("Enter the side of the Hexagon");
        d = keyboard.nextDouble();

        Hexagon hexagon = new Hexagon(d);
        System.out.println("The area of the Hexagon is: " + hexagon.area());
        System.out.println("The perimeter of the Hexagon is: " + hexagon.perimeter());

        System.out.println("Enter the side of the Octagon");
        d = keyboard.nextDouble();

        Octagon octagon = new Octagon(d);
        System.out.println("The area of the Octagon is: " + octagon.area());
        System.out.println("The perimeter of the Octagon is: " + octagon.perimeter());

        System.out.println("Enter the length and width of the Rectangle");
        d = keyboard.nextDouble();
        e = keyboard.nextDouble();

        Rectangle rectangle = new Rectangle(d,e);
        System.out.println("The area of the Rectangle is: " + rectangle.area());
        System.out.println("The perimeter of the Rectangle is: " + rectangle.perimeter());
























    }
}
