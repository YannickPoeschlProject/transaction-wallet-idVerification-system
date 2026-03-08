package de.yannickPoeschl.transaction_Wallet_IdVerification_System.Exceptions;

public class NegativeValueException extends RuntimeException {
    public NegativeValueException(String message) {
        super(message);
    }
}
