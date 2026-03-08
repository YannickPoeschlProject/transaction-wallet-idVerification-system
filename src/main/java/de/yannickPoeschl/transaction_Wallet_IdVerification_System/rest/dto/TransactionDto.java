package de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.Transaction;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.TransactionStatus;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.TransactionType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionDto {

    private long id;

    private long useraccountId;

    private TransactionType type;

    private long amount;

    private TransactionStatus status;

    private LocalDateTime dateTimeCreated;

    private LocalDateTime dateTimeLastUpdate;


    public static TransactionDto fromEntity(Transaction transaction) {
        TransactionDto dto = new TransactionDto();

        dto.setId(transaction.getId());
        dto.setUseraccountId(transaction.getUseraccount().getId());
        dto.setType(transaction.getType());
        dto.setAmount(transaction.getAmount());
        dto.setStatus(transaction.getStatus());
        dto.setDateTimeCreated(transaction.getDateTimeCreated());
        dto.setDateTimeLastUpdate(transaction.getDateTimeLastUpdate());

        return dto;
    }

}
