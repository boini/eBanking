package com.ebanking.ws.model.operation;

import com.ebanking.ws.model.address.Address;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.model.finance.Amount;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "OPERATION")
public class Operation {

    @Id
    @GeneratedValue
    @Column(name = "OPERATION_ID")
    private long operationId;

    @ManyToOne
    @JoinColumn(name = "OPERATION_STATUS_ID")
    private OperationStatus operationStatus;

    @ManyToOne
    @JoinColumn(name = "OPERATION_TYPE_ID")
    private OperationType operationType;

    @Column(name = "OPERATION_KEY")
    private String operationKey;

    @Column(name = "TRANSACTION_DATE")
    private Date transactionDate;

    @Column(name = "PROCESSING_DATE")
    private Date processingDate;

    @ManyToOne
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;
/*
    private Amount transactionAmount;*/

    @ManyToOne
    @JoinColumn(name = "CARD_ID")
    private Card card;

    @ManyToOne
    @JoinColumn(name = "CONTRACTOR_ACCOUNT_ID")
    private CardAccount contractorAccount;

    public long getOperationId() {
        return operationId;
    }

    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public String getOperationKey() {
        return operationKey;
    }

    public void setOperationKey(String operationKey) {
        this.operationKey = operationKey;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Date getProcessingDate() {
        return processingDate;
    }

    public void setProcessingDate(Date processingDate) {
        this.processingDate = processingDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
/*
    public Amount getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Amount transactionAmount) {
        this.transactionAmount = transactionAmount;
    }*/

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public CardAccount getContractorAccount() {
        return contractorAccount;
    }

    public void setContractorAccount(CardAccount contractorAccount) {
        this.contractorAccount = contractorAccount;
    }
}
