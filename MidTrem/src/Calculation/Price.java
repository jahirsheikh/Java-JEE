package Calculation;

public class Price {

    private double qty;
    private double price;

    public Price() {
    }

    public Price(double qty, double price) {
        this.qty = qty;
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculationtotalprice() {

        double totalprice = qty * price;
        return totalprice;
    }

}
