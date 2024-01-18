package Bank;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class TestFile {

    @Test
    public void testCalculateMonthlyRate() {
        double debt = 10000.0;
        double interestRate = 5.0;
        int duration = 12;

        double expectedMonthlyRate = 856.0748178846737;
        double actualMonthlyRate = Loan.calculateMonthlyRate(debt, interestRate, duration);

        Assertions.assertEquals(expectedMonthlyRate, actualMonthlyRate);
    }

}