class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NoFlyBehavior(), new MuteBehavior());
    }

    public void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}