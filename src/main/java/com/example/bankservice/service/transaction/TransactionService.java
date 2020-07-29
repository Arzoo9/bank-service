package com.example.bankservice.service.transaction;

import com.example.bankservice.dao.transcation.TransactionDao;
import com.example.bankservice.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransactionService {
    private final TransactionDao transactionDao;

    @Autowired
    public TransactionService(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public int addTransaction(Transaction transaction){
        UUID id = UUID.randomUUID();
        return transactionDao.insertTransaction(id.toString(), transaction);
    }

    public List<Transaction> getAllTransaction(){
        return transactionDao.getAllTransaction();
    }

    public List<Transaction> getTransactionByAccountNumber(String accountNumber){
        return transactionDao.getTransactionByAccountNumber(accountNumber);
    }

    public void deleteTransactionById(String id){
        transactionDao.deleteTransactionById(id);
    }

}
