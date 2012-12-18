package com.ebanking.ws.dao;

import com.ebanking.ws.model.card.CardType;

public interface CardTypeDAO {
    CardType getCardTypeByName(String name);
}
