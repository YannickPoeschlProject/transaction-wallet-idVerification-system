package de.yannickPoeschl.transaction_Wallet_IdVerification_System.Exceptions;

public class StatusAlreadySetException extends RuntimeException {
    public StatusAlreadySetException(String message) {
        super(message);
    }
}
