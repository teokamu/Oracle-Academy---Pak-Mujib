public class Instrument {

    private String name;
    private double price;
    private boolean onSale;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
        this.onSale = false;
    }

    public String getName() { return name; }

    public boolean isOnSale() { return onSale; }
    public void setOnSale(boolean onSale) { this.onSale = onSale; }

    // jika onSale, harga 15% lebih murah (85% dari harga awal)
    public double getPrice() {
        if (onSale) {
            return price * 0.85;
        }
        return price;
    }

    // diskon karyawan: 75% dari harga awal
    public double getEmployeePrice() {
        return price * 0.75;
    }
}