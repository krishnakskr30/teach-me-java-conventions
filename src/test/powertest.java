package powerpackage;
import org.junit.Test;

public class powertest {
    @Test
    public void testOnePowerOneIsOne() {
        assert powerfinder.baseRaisedToPower(1,1) == 1;
    }

    @Test
    public void testTwoPowerOneIsTwo() {
        assert powerfinder.baseRaisedToPower(2,1) == 2;
    }

    @Test
    public void testTwoPowerTwoIsFour() {
        assert powerfinder.baseRaisedToPower(2, 2) == 4;
    }

    @Test
    public void testThreePowerTwoIsNine() {
        assert powerfinder.baseRaisedToPower(3, 2) == 9;
    }
}
