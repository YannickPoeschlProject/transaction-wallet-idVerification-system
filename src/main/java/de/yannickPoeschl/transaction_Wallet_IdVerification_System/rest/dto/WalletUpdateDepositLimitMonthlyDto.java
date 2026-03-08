package de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.wallet.Wallet;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class WalletUpdateDepositLimitMonthlyDto {

    @NotNull
    private long id;

    @NotNull
    private long depositLimitMonthly;

    public static WalletUpdateDepositLimitMonthlyDto fromEntity(Wallet wallet) {

        WalletUpdateDepositLimitMonthlyDto dto = new WalletUpdateDepositLimitMonthlyDto();

        dto.setId(wallet.getId());
        dto.setDepositLimitMonthly(wallet.getDepositLimitMonthly());

        return dto;
    }

}
