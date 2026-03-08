package de.yannickPoeschl.transaction_Wallet_IdVerification_System.repository;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.id.IdVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IdVerificationRepository extends JpaRepository<IdVerification, Long> {

    List<IdVerification> findAll();

    Optional<IdVerification> findById(long id);

    Optional<IdVerification> findByUseraccountId(long useraccountId);

    List<IdVerification> findAllBySurnameAndName(String surname, String name);

    Optional<IdVerification> findByIdNumber(String idNumber);

    List<IdVerification> findAllByValidUntilLessThanEqual(LocalDate date);

    @Query("SELECT i FROM IdVerification i WHERE i.validUntil < :date")
    List<IdVerification> findAllExpiredIds(@Param("date") LocalDate date);

    @Query("SELECT i FROM IdVerification i WHERE i.validUntil >= :date")
    List<IdVerification> findAllValidIds(@Param("date") LocalDate date);



}
