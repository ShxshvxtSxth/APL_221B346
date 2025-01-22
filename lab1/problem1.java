
class Mother {
    
    int x = 10;

    
    void show() {
        System.out.println("Mother's show() method. x = " + x);
    }
}


class Child extends Mother {
    // The Child class inherits the show() method from Mother
    // No additional implementation needed in Child
}


class Application {
    public void run() {
        // Create an object of the Mother class
        Mother m = new Mother();
        m.show(); // show() of Mother is called
        
        // Create an object of the Child class
        Child ch = new Child();
        ch.show(); // show() inherited from Mother is called
    }
}

// Define the Main class with the main method to run the program
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Application class
        Application app = new Application();
        
        // Run the Application
        app.run();
    }
}
