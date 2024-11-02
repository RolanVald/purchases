package com.gastos.tdc.models.service;

import com.gastos.tdc.models.entity.Card;

import java.util.List;

public interface CardService {
    List<Card> getAllCards();
    Card saveCard(Card card);
}
