package model.services;

public class PaypalService implements PaymentService{

    public static double installmentTax(double quota, int month) {
        return (quota * 0.01) * month;
    }
    public static double paymentTax() {
        return 1.02;
    }

}
