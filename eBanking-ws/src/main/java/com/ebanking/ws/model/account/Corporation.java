package com.ebanking.ws.model.account;

import com.ebanking.ws.model.card.CardAccount;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CORPORATION")
public class Corporation {
    @Id
    @Column(name = "CORPORATION_ID")
    @GeneratedValue
    private long corporationId;
    @Column(name = "CORPORATION_NAME")
    private String corporationName;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "corporation", fetch = FetchType.EAGER)
    private Set<BankAccount> bankAccountList = new HashSet<BankAccount>();

    public Set<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(Set<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public long getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(long corporationId) {
        this.corporationId = corporationId;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Corporation{" +
                "corporationId=" + corporationId +
                ", corporationName='" + corporationName + '\'' +
                ", description='" + description +
                '}';
    }
}
