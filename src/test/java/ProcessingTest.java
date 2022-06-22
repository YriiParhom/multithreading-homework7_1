import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ProcessingTest {
    final Processing processing = new Processing();

    @Test
    public void anuityPaymentTest(){
        Assertions.assertEquals(13830.00, processing.anuityPayment(300000, 10, 24));
        Assertions.assertEquals(0.00, processing.anuityPayment(0, 10, 24));
        Assertions.assertEquals(0.00, processing.anuityPayment(300000, 0, 24));
        Assertions.assertEquals(0.00, processing.anuityPayment(300000, 10, 0));
    }

    @Test
    public void totalSumTest(){
        Assertions.assertEquals(122160.00, processing.totalSum(5090, 24));
        Assertions.assertEquals(0.00, processing.totalSum(0.00, 24.00));
        Assertions.assertEquals(0.00, processing.totalSum(5090, 0.00));
    }

    @Test
    public void overpayment(){
        Assertions.assertEquals(22160, processing.overpayment(122160.00, 100000));
    }
}
