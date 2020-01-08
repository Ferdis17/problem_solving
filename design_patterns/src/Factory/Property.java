package Factory;

public abstract class Property {

    protected double rentalRate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rentalRate);
    }
}
