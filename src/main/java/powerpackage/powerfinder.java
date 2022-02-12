package powerpackage;

public class powerfinder {
    public static int baseRaisedToPower(int base, int power) {
        int product = 1;
        for (int i = 0; i<power; i++) {
            product *= base;
        }
        return product;
    }
}
