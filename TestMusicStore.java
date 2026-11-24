public class TestMusicStore {
    public static void main(String[] args) {
        Guitar g = new Guitar("Fender Stratocaster", 1000000, 6, true);

        System.out.println(g.getName());
        System.out.println("Harga normal   : " + g.getPrice());
        System.out.println("Harga karyawan : " + g.getEmployeePrice());

        g.setOnSale(true);
        System.out.println("Harga saat sale: " + g.getPrice());
        System.out.println("Jumlah senar   : " + g.getNumberOfStrings());
    }
}