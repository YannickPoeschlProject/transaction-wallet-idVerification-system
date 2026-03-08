package de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.wallet.Wallet;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

//DTO für die Erweiterbarkeit: Aktuell nur die ID --> später
//könnten weitere Felder ergänzt werden

public class WalletCreateDto {

    @NotNull
    private long useraccountId;

    public static WalletCreateDto fromEntity(Wallet wallet) {
        WalletCreateDto dto = new WalletCreateDto();

        dto.setUseraccountId(wallet.getUseraccount().getId());

        return dto;
    }

}
