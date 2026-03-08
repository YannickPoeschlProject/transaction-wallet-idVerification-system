package de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest;

import de.yannickPoeschl.transaction_Wallet_IdVerification_System.model.transaction.Transaction;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto.TransactionCreateDto;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto.TransactionDto;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto.TransactionExecuteDto;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.rest.dto.TransactionExecuteRequestDto;
import de.yannickPoeschl.transaction_Wallet_IdVerification_System.service.TransactionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction")
@RequiredArgsConstructor
public class TransactionRestController {

    //Aktuelle Methoden für User:

    private final TransactionService transactionService;

    @GetMapping("/getById/{id}")
    public ResponseEntity<TransactionDto> getById(@PathVariable long id) {

        Transaction transaction = transactionService.getById(id);

        TransactionDto dto = TransactionDto.fromEntity(transaction);

        return ResponseEntity.ok(dto);
    }

    @GetMapping("/getAllByUseraccountId/{useraccountId}")
    public ResponseEntity<List<TransactionDto>> getAllByUseraccountId(@PathVariable long useraccountId) {

        List<TransactionDto> dtos = transactionService
                .getAllByUseraccountId(useraccountId)
                .stream()
                .map(t -> TransactionDto.fromEntity(t))
                .toList();

        return ResponseEntity.ok(dtos);
    }

    @PostMapping("/create")
    public ResponseEntity<TransactionDto> createTransaction(@RequestBody @Valid TransactionCreateDto dto) {

        Transaction t = transactionService.createTransaction(dto.getUseraccountId(), dto.getType(), dto.getAmount());

        return ResponseEntity.ok(TransactionDto.fromEntity(t));
    }

    //Rückgabe-DTO zeigt für Entwicklungszwecke aktuell mehr Spalten an als übergeben werden
    //Wird später entfernt, damit keine unberechtigten Spalten ausgelesen werden können
    @PostMapping("/execute")
    public ResponseEntity<TransactionExecuteDto> executeTransaction(@RequestBody @Valid TransactionExecuteRequestDto dto) {

        TransactionExecuteDto dtoReturn = transactionService.executeTransaction(dto.getUseraccountId(), dto.getType(), dto.getAmount());

        return ResponseEntity.ok(dtoReturn);

    }

}
