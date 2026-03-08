package de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.Transaction;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.TransactionStatus;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.TransactionType;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.wallet.Wallet;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionExecuteDto {

    private long id;

    private long useraccountId;

    private TransactionType type;

    private long amount;

    private TransactionStatus status;

    private LocalDateTime dateTimeCreated;

    private LocalDateTime dateTimeLastUpdate;

    private long walletId;

    private long walletBalance;

    private long walletBonusBalance;

    private long walletDepositLimitMonthly;

    private long walletDepositLimitMonthlyCounter;


    public static TransactionExecuteDto fromEntity(Transaction transaction, Wallet wallet) {
        TransactionExecuteDto dto = new TransactionExecuteDto();

        dto.id = transaction.getId();
        dto.useraccountId = transaction.getUseraccount().getId();
        dto.type = transaction.getType();
        dto.amount = transaction.getAmount();
        dto.status = transaction.getStatus();
        dto.dateTimeCreated = transaction.getDateTimeCreated();
        dto.dateTimeLastUpdate = transaction.getDateTimeLastUpdate();
        dto.walletId = wallet.getId();
        dto.walletBalance = wallet.getBalance();
        dto.walletBonusBalance = wallet.getBonusBalance();
        dto.walletDepositLimitMonthly = wallet.getDepositLimitMonthly();
        dto.walletDepositLimitMonthlyCounter = wallet.getDepositLimitMonthlyCounter();

        return dto;
    }

}
