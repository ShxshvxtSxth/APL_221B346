// Abstract class Bharatvanshi
abstract class Bharatvanshi {
    public abstract void fight();
    public abstract void obey();
}

// Concrete class Pandav
class Pandav extends Bharatvanshi {
    @Override
    public void fight() {
        System.out.println("Pandav fighting skills");
    }

    @Override
    public void obey() {
        System.out.println("Pandav obeying");
    }

    public void kind() {
        System.out.println("Pandav showing kindness");
    }
}

// Concrete class Kaurav
class Kaurav extends Bharatvanshi {
    @Override
    public void fight() {
        System.out.println("Kaurav fighting skills");
    }

    @Override
    public void obey() {
        System.out.println("Kaurav disobeying");
    }

    public void cruel() {
        System.out.println("Kaurav showing cruelty");
    }
}

// Concrete class Vikarn
class Vikarn extends Kaurav {
    @Override
    public void obey() {
        System.out.println("Vikarn obeying");
    }

    public void kind() {
        System.out.println("Vikarn showing kindness");
    }
}

// Main class to demonstrate the usage
public class Main {
    public static void main(String[] args) {
        Pandav arjun = new Pandav();
        arjun.fight();
        arjun.obey();
        arjun.kind();

        Kaurav duryodhan = new Kaurav();
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.cruel();

        Vikarn vikarn = new Vikarn();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}