package de.yannickPoeschl.transaction_Wallet_IdVerification_System.repository;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.wallet.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet, Long> {


    List<Wallet> findAll();

    Optional<Wallet> findById(long id);

    Optional<Wallet> findByUseraccountId(long useraccountId);

    //Query wird 1x pro Monat (01.01 00:00 Uhr) ausgeführt
    @Modifying
    @Query("UPDATE Wallet w SET w.depositLimitMonthlyCounter = 0")
    void resetAllDepositLimitMonthlyCounter();






}
