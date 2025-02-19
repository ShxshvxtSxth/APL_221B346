class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFlyBehavior(), new SqueakBehavior());
    }

    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}