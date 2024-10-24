package com.gastos.tdc.repository;

import com.gastos.tdc.models.entity.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, Integer> {
}
