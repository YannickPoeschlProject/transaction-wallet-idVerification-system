package de.yannickPoeschl.transaction_Wallet_IdVerification_System.Exceptions;

public class ExpiredIdException extends RuntimeException {
    public ExpiredIdException(String message) {
        super(message);
    }
}
