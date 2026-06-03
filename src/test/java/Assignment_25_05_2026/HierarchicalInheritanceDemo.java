package Assignment_25_05_2026;

public class HierarchicalInheritanceDemo {
 public static void main(String[] args) {
     Circle circle = new Circle(5);
     Rectangle rectangle = new Rectangle(4, 6);

     circle.display();
     System.out.println("Area of Circle: " + circle.area());

     rectangle.display();
     System.out.println("Area of Rectangle: " + rectangle.area());
 }
}

