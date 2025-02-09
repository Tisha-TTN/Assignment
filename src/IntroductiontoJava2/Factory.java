package IntroductiontoJava2;
import java.util.Scanner;

// Step 1: Create an interface
interface Shape {
    void draw();
}

// Step 2: Create concrete classes implementing the interface
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

// Step 3: Create a Factory to generate objects of concrete classes
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}

// Step 4: Main class to demonstrate Factory Pattern
public class Factory{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeFactory shapeFactory = new ShapeFactory();

        while (true) {
            System.out.print("Enter shape (CIRCLE, RECTANGLE, SQUARE) or QUIT to exit: ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("QUIT")) {
                System.out.println("Exiting program.");
                break;
            }

            Shape shape = shapeFactory.getShape(input);

            if (shape != null) {
                shape.draw();
            } else {
                System.out.println("Invalid shape! Please enter again.");
            }
        }
        scanner.close();
    }
}