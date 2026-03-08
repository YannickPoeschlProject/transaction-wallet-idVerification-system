package de.yannickPoeschl.transaction_Wallet_IdVerification_System.repository;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.useraccount.Useraccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UseraccountRepository extends JpaRepository<Useraccount, Long> {

    //Repository eines anderen Teammitglieds

    Optional<Useraccount> findById(long id);

}
