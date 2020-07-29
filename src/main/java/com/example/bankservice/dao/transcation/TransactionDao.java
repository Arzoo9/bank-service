package com.example.bankservice.dao.transcation;

import com.example.bankservice.model.Transaction;
import com.example.bankservice.repository.transaction.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionDao{

    @Autowired
    TransactionRepository repository;

    public int insertTransaction(String id, Transaction transaction) {
        repository.save(new Transaction(id, transaction.getType(), transaction.getFromAccountNumber(), transaction.getToAccountNumber(), transaction.getTotalBalance(), transaction.getAccountTypeCode(), transaction.getStatus(), transaction.getAccountNumber()));
        return 0;
    }

    public List<Transaction> getAllTransaction(){
        return repository.findAll();
    }

    public List<Transaction> getTransactionByAccountNumber(String accountNumber){
        return repository.getAllByAccountNumber(accountNumber);
    }

    public void deleteTransactionById(String id){
        repository.deleteById(id);
    }
}
