// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Test class instance
        Test test = new Test();
        test.display();  // Calling the display() method from Test class.

        // ConcreteTest class instance (subclass of AbsTest)
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();  // Calling the display() method from ConcreteTest class.
    }
}
