public class StringInstrument extends Instrument {

    private int numberOfStrings;

    public StringInstrument(String name, double price, int numberOfStrings) {
        super(name, price);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() { return numberOfStrings; }
}
