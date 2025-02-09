package IntroductiontoJava2;
class Singleton {
    // Private static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent object creation from outside
    private Singleton() {
        System.out.println("Singleton Instance Created.");
    }

    // Public static method to provide global access to the instance
    public static Singleton getInstance() {
        if (instance == null) {  // Create instance if not already created
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Step 2: Main class to test Singleton Pattern
public class SingletonExample {
    public static void main(String[] args) {
        // Try to create multiple instances
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Call a method
        obj1.showMessage();

        // Verify that both references point to the same instance
        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Different instances (Singleton not working correctly).");
        }
    }
}