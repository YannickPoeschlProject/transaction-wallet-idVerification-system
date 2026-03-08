package de.yannickPoeschl.transaction_Wallet_IdVerification_System.config;

public interface GlobalConstants {

    //Konstanten
    long CASH_TO_POINTS_FACTOR = 1; // 1 Cent = 1 Point
    long BONUS_POINTS_FIRST_DEPOSIT = 2000;

    public static long cashToPoints(long amount) {
        return amount * CASH_TO_POINTS_FACTOR;
    }
    
    public static long pointsToCash(long pointsAmount){ return pointsAmount / CASH_TO_POINTS_FACTOR; }
}


