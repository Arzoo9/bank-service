package com.example.bankservice.controller.transaction;

import com.example.bankservice.model.Transaction;
import com.example.bankservice.service.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/transaction")
@RestController
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public void addTransaction(@RequestBody Transaction transaction){
        transactionService.addTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransaction(){
        return transactionService.getAllTransaction();
    }

    @GetMapping(path = "/{accountNumber}")
    public List<Transaction> getTransactionsByAccountNumber(@PathVariable("accountNumber") String accountNumber){
        return transactionService.getTransactionByAccountNumber(accountNumber);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTransactionById(@PathVariable("id") String id){
        transactionService.deleteTransactionById(id);
    }
}
