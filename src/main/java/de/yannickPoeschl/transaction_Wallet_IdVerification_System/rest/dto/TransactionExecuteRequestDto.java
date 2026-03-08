package de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.Transaction;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.TransactionType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TransactionExecuteRequestDto {

    @NotNull
    private long useraccountId;

    @NotNull
    private TransactionType type;

    @NotNull
    private long amount;

    public static TransactionExecuteRequestDto fromEntity(Transaction transaction) {
        TransactionExecuteRequestDto dto = new TransactionExecuteRequestDto();

        dto.setUseraccountId(transaction.getUseraccount().getId());
        dto.setType(transaction.getType());
        dto.setAmount(transaction.getAmount());

        return dto;
    }

}
