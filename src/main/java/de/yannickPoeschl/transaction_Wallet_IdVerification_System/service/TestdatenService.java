package de.yannickPoeschl.transaction_Wallet_IdVerification_System.service;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.useraccount.Useraccount;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.repository.IdVerificationRepository;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.repository.UseraccountRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class TestdatenService {

    private final UseraccountRepository useraccountRepository;
    private final TransactionService transactionService;
    private final WalletService walletService;
    private final IdVerificationService idVerificationService;
    private final IdVerificationRepository idVerificationRepository;

    //Useraccount-Objekte anlegen, da Useraccount von einem anderen Teammitglied implementiert wird
    //REST wurde für Useraccount noch nicht angelegt

    //Objekte für Transaction, Wallet und IdVerification können per REST angelegt werden
    public void createUseraccountTestData() {


        Useraccount testUseraccount1 = new Useraccount();
        Useraccount testUseraccount2 = new Useraccount();
        Useraccount testUseraccount3 = new Useraccount();
        Useraccount testUseraccount4 = new Useraccount();
        Useraccount testUseraccount5 = new Useraccount();

        useraccountRepository.save(testUseraccount1);
        useraccountRepository.save(testUseraccount2);
        useraccountRepository.save(testUseraccount3);
        useraccountRepository.save(testUseraccount4);
        useraccountRepository.save(testUseraccount5);


    }

}
