public class Main {
    public static void main(String[] args) {
        Processing processing = new Processing();
        System.out.println(processing.anuityPayment(100000, 20, 24));
        System.out.println(processing.totalSum(processing.anuityPayment(100000, 20, 24), 24));
        System.out.println(processing.overpayment
                (processing.totalSum(processing.anuityPayment
                        (100000, 20, 24), 24), 100000));
    }
}