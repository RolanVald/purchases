package com.gastos.tdc.models.service;

import com.gastos.tdc.models.entity.Card;
import com.gastos.tdc.repository.CardRepository;
import com.gastos.tdc.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    static final Logger LOGGER = LoggerFactory.getLogger(CardServiceImpl.class);
    private final CardRepository cardRepository;
    private final UserRepository userRepository;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository, UserRepository userRepository) {
        this.cardRepository = cardRepository;
        this.userRepository = userRepository;
    }


    @Override
    public List<Card> getAllCards() {
        List<Card> allCards = new ArrayList<>();
        cardRepository.findAll().forEach(allCards::add);
        return allCards;
    }

    @Override
    public Card saveCard(Card card) {
        return cardRepository.save(card);
    }
}
