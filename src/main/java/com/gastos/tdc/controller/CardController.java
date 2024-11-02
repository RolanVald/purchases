package com.gastos.tdc.controller;

import com.gastos.tdc.models.entity.Card;
import com.gastos.tdc.models.service.CardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {
    private final CardServiceImpl cardService;

    @Autowired
    public CardController(CardServiceImpl cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public ResponseEntity<List<Card>> getAllCards() {
        List<Card> response = cardService.getAllCards();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/add")
    public ResponseEntity<Card> saveCard(@RequestBody Card card) {
        Card card1 = cardService.saveCard(card);
        return ResponseEntity.ok(card1);
    }
}
