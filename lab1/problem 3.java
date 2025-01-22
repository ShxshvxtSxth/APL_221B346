class Mother {
    public void show() {
        System.out.println("Mother's show()");
    }
}

class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Child's show()");
    }
}

public class Main {
    public static void main(String[] args) {
        Mother m1 = new Child();  // Polymorphism
        m1.show();  // Call show method
    }
}
