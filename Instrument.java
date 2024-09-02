public class Instrument {
    private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instrument() {
        type = "null";
        price = 0;
    }

    public Instrument(String t, double p) {
        type = t;
        price = p;
    }

    public void print() {
        System.out.println(type+" Price : "+ price);
    } 
 
}
