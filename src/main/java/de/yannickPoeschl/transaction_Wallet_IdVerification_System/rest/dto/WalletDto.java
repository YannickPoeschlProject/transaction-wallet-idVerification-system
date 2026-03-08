package de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.wallet.Wallet;
import lombok.Data;

@Data
public class WalletDto {

    private long id;

    private long useraccountId;

    private long balance;

    private long bonusBalance;

    private long depositLimitMonthly;

    private long depositLimitMonthlyCounter;

    public static WalletDto fromEntity(Wallet wallet) {

        WalletDto dto = new WalletDto();

        dto.setId(wallet.getId());
        dto.setUseraccountId(wallet.getUseraccount().getId());
        dto.setBalance(wallet.getBalance());
        dto.setBonusBalance(wallet.getBonusBalance());
        dto.setDepositLimitMonthly(wallet.getDepositLimitMonthly());
        dto.setDepositLimitMonthlyCounter(wallet.getDepositLimitMonthlyCounter());

        return dto;
    }

}
