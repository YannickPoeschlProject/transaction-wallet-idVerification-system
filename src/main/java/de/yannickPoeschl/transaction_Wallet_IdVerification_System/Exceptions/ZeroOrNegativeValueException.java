package de.yannickPoeschl.transaction_Wallet_IdVerification_System.Exceptions;

public class ZeroOrNegativeValueException extends RuntimeException {
    public ZeroOrNegativeValueException(String message) {
        super(message);
    }
}
