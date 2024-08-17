package ExceptionHandling.CustomException;


class PaymentException extends Exception {
    PaymentException() {
        super(" Invalid payment amount");
    }

    PaymentException(String s) {
        super(s);
    }
}

public class PaymentService {
    void processPayment(double salary) throws PaymentException {
        if (salary <= 0) {
            throw new PaymentException("Invalid payment amount " + salary);
        }
    }

    public static void main(String[] arg) {
        PaymentService paymentService = new PaymentService();
        try {
            paymentService.processPayment(100);
        } catch (PaymentException e) {
            e.printStackTrace();
        }
    }
}