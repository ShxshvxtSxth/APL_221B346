class LakeDuck extends Duck {
    public LakeDuck() {
        super(new FlyWithWings(), new SimpleQuack());
    }

    public void display() {
        System.out.println("I'm a Lake Duck.");
    }
}