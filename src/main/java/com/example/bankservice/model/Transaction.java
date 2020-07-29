package com.example.bankservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    private String id;
    private final String type;
    private final String fromAccountNumber;
    private final String toAccountNumber;
    private final String totalBalance;
    private final String accountTypeCode;
    private final String status;
    private final String accountNumber;
//    private final Date date;

    public Transaction(@JsonProperty("id") String id,
                       @JsonProperty("type") String type,
                       @JsonProperty("From") String fromAccountNumber,
                       @JsonProperty("To") String toAccountNumber,
                       @JsonProperty("total") String totalBalance,
                       @JsonProperty("accountTypeCode") String accountTypeCode,
                       @JsonProperty("status") String status,
                       @JsonProperty("accountNumber") String accountNumber){
        this.id = id;
        this.type = type;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.totalBalance = totalBalance;
        this.accountTypeCode = accountTypeCode;
        this.status = status;
        this.accountNumber = accountNumber;
        //this.date = date;
    }

    public Transaction(){
        this.id = "123";
        this.type = "checking";
        this.fromAccountNumber = "123";
        this.toAccountNumber = "123";
        this.totalBalance = "123";
        this.accountTypeCode = "123";
        this.status = "123";
        this.accountNumber = "123";
        //this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public String getTotalBalance() {
        return totalBalance;
    }

    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    public String getStatus() {
        return status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
