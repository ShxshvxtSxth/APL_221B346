class One {
    One(int x) {
        System.out.println("One's constructor with value: " + x);
    }
}

class Two extends One {
    Two(int x) {
        super(x); 
        System.out.println("Two's constructor with value: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Two obj = new Two(10); 
    }
}
