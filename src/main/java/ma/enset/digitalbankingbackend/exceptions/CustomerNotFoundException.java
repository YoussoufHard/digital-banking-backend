package ma.enset.digitalbankingbackend.exceptions;

public class CustomerNotFoundException extends RuntimeException { // Préférez RuntimeException
    public CustomerNotFoundException(String msg , Long customerId) {
        super(msg +" "+ customerId);
    }
}