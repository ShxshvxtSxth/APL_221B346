
class Mother {
    void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}


class Application {
    public void run() {
        
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}
