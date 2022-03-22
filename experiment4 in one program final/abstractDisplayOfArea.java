package com.company;

/**
 *  The Shape class is an abstract class that holds
 *  general data about a shape.
 */

abstract class dimension
{
    private double height;  // To hold height.
    private double width;  //To hold width or base

    // Set height and width
    public void setValues(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    //Get height
    public double getHeight()
    {

        return height;
    }

    //Get width
    public double getWidth()
    {

        return width;
    }

    // The getArea method is abstract.
    // It must be overridden in a subclass.

    abstract public double getArea();
}

/**
 *  This class Rectangle calculates
 *  the area of rectangle
 */

class RectangleSubClass extends dimension
{
    //Calculate and return area of rectangle
    public double getArea()
    {

        return getHeight() * getWidth();
    }
}

/**
 *  This class Triangle calculates
 *  the area of triangle
 */

class TriangleSubClass extends dimension
{
    //Calculate and return area of triangle
    public double getArea()
    {

        return (getHeight() * getWidth()) / 2;
    }
}
public class abstractDisplayOfArea {
    public static void main(String[] args) {
        dimension dimension;

        RectangleSubClass rect = new RectangleSubClass(); // assign subclass reference to subclass variable
        dimension = rect; // shape points to the object rect.
        dimension.setValues(78, 5); // Set data in Rectangle's object
        System.out.println("Area of rectangle : " + dimension.getArea()); //Display the area of rectangle


        TriangleSubClass tri = new TriangleSubClass(); // assign subclass reference to subclass variable
        dimension = tri; // shape points to the object rect.
        dimension.setValues(34,3); // Set data in Triangle's object
        System.out.println("Area of triangle : " + dimension.getArea()); //Display the area of triangle
    }

}
