class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new SimpleQuack());
    }

    public void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}