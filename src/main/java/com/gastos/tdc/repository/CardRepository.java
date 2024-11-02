package com.gastos.tdc.repository;

import com.gastos.tdc.models.entity.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Integer> {
}
