public class Guitar extends StringInstrument {

    private boolean electric;

    public Guitar(String name, double price, int numberOfStrings, boolean electric) {
        super(name, price, numberOfStrings);
        this.electric = electric;
    }

    public boolean isElectric() { return electric; }
}