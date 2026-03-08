package de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto.IdVerificationCreateDto;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.service.IdVerificationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/IdVerification")
@RequiredArgsConstructor
public class IdVerificationRestController {

    private final IdVerificationService idVerificationService;

    //Aktuelle Methoden für User:

    //Es werden keine Ausweisdaten nach aussen gegeben.
    //User besitzt keine Möglichkeit zur Ansicht der Ausweisdaten.

    @PostMapping("/create")
    public void createIdVerification(@RequestBody @Valid IdVerificationCreateDto dto) {

        idVerificationService.createIdVerification(dto);

    }

}

