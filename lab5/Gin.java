class Gin extends Decorator{
    Gin(Offering offering){
        this.offering=offering;
    }
    String getName(){
        return offering.getName()+"with Gin";
    }
    int getprice(){
        return offering.getPrice()+65;
    }
}