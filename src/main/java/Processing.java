import java.math.BigDecimal;
import java.math.RoundingMode;

public class Processing {

    public double anuityPayment(double credit, double rate, double period) {

        if (credit == 0 || rate == 0 || period == 0) return 0;

        double m = (rate / 12) / 100;
        m = new BigDecimal(m).setScale(4, RoundingMode.HALF_UP).doubleValue();

        double ratio = (m * Math.pow((1 + m), period)) / (Math.pow((1 + m), period) - 1);
        ratio = new BigDecimal(ratio).setScale(4, RoundingMode.HALF_UP).doubleValue();
        return credit * ratio;
    }

    public double totalSum(double anuity, double period) {
        return anuity * period;
    }

    public double overpayment(double totalSum, double credit) {
        return totalSum - credit;
    }

}
