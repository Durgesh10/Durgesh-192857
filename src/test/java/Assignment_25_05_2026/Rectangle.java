package Assignment_25_05_2026;

//Rectangle class extending Shape
public class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 public double area() {
     return length * width;
 }

 @Override
 public void display() {
     System.out.println("Rectangle with length " + length + " and width " + width);
 }
}