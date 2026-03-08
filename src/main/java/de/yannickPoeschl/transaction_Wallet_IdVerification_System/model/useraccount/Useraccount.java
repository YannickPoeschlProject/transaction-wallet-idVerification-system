package de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.useraccount;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.id.IdVerification;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.Transaction;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.wallet.Wallet;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Useraccount implements Serializable {

    //Entity eines anderen Teammitglieds

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Wallet wallet;

    @OneToOne
    private IdVerification idVerification;

    @Override
    public String toString() {
        return "Useraccount{" +
                "id=" + id +
                ", wallet=" + wallet +
                ", idVerification=" + idVerification +
                '}';
    }
}