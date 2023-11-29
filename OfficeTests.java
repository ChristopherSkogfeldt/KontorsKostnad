import org.example.Office;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class OfficeTests {

    @Test
    public void testCalculateMonthlyRentForSmallOffice() {
        Office smallOffice = new Office(15.0);
        Assert.assertEquals(4187.5 , smallOffice.calculateMonthlyRent(), 0.001);
    }

    @Test
    public void testCalculateMonthlyRentForLargeOffice() {
        Office largeOffice = new Office(25.0);
        assertEquals(6114.583333333333, largeOffice.calculateMonthlyRent(), 0.001);
    }

    @Test
    public void testCalculateMonthlyRentForMediumOffice() {
        Office mediumOffice = new Office(18.0);
        assertEquals(5025.0, mediumOffice.calculateMonthlyRent(), 0.001);
    }
}




